package io.vdubovsky.kiecustomclient.service;

import io.vdubovsky.kiecustomclient.dto.PingPongResultDto;
import org.springframework.web.context.request.async.DeferredResult;

public interface PingPongService {

    DeferredResult<PingPongResultDto> play();
}
