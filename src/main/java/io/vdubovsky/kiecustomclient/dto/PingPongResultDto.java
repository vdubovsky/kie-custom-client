package io.vdubovsky.kiecustomclient.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PingPongResultDto {

    private Integer retryCount;
}
