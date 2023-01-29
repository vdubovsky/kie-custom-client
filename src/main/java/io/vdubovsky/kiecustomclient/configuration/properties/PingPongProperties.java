package io.vdubovsky.kiecustomclient.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "ping-pong")
@Data
public class PingPongProperties {

    private String containerId;
    private String processId;
}
