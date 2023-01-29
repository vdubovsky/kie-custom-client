package io.vdubovsky.kiecustomclient;

import io.vdubovsky.kiecustomclient.configuration.properties.KieProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class KieCustomClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(KieCustomClientApplication.class, args);
    }
}
