package io.vdubovsky.kiecustomclient.rest.controller;

import io.vdubovsky.kiecustomclient.dto.PingPongResultDto;
import io.vdubovsky.kiecustomclient.service.PingPongServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
@RequestMapping("api/v1/ping-pong")
@RequiredArgsConstructor
public class PingPongController {

    private final PingPongServiceImpl pingPongService;

    @PostMapping
    public DeferredResult<PingPongResultDto> play() {
        return pingPongService.play();
    }
}
