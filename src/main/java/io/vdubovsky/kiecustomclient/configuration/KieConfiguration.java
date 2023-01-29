package io.vdubovsky.kiecustomclient.configuration;

import io.vdubovsky.kiecustomclient.configuration.properties.KieProperties;
import lombok.RequiredArgsConstructor;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class KieConfiguration {

    private final KieProperties kieProperties;

    @Bean
    public KieServicesClient kieServicesClient() {
        KieServicesConfiguration kieServicesConfiguration = KieServicesFactory.newRestConfiguration(
                kieProperties.getUrl(),
                kieProperties.getUsername(),
                kieProperties.getPassword(),
                5 * 60 * 1000
                );

        kieServicesConfiguration.setMarshallingFormat(MarshallingFormat.JSON);

        return KieServicesFactory.newKieServicesClient(kieServicesConfiguration);
    }
}
