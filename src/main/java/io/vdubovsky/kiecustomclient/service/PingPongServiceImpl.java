package io.vdubovsky.kiecustomclient.service;

import io.vdubovsky.kiecustomclient.configuration.properties.PingPongProperties;
import io.vdubovsky.kiecustomclient.dto.PingPongResultDto;
import lombok.RequiredArgsConstructor;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.ProcessServicesClient;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

@Service
@RequiredArgsConstructor
public class PingPongServiceImpl implements PingPongService {

    private final ExecutorService kieExecutorService;
    private final KieServicesClient kieServicesClient;

    private final PingPongProperties pingPongProperties;

    @Override
    public DeferredResult<PingPongResultDto> play() {
        DeferredResult<PingPongResultDto> deferredResult = new DeferredResult<>();
        kieExecutorService.submit(() -> {
            deferredResult.setResult(new PingPongResultDto().setRetryCount(startTaskAndGetResult()));
        });
        return deferredResult;
    }

    private Integer startTaskAndGetResult() {
        ProcessServicesClient processServicesClient = kieServicesClient.getServicesClient(ProcessServicesClient.class);
        Map<String, Object> variables = new HashMap<>();
        Map<String, Object> result = processServicesClient.computeProcessOutcome(pingPongProperties.getContainerId(), pingPongProperties.getProcessId(), variables);

        return (Integer) result.get("counter");
    }
}
