package io.vdubovsky.kiecustomclient.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "kie.server")
@Data
public class KieProperties {

    private String url;
    private String username;
    private String password;
}
