package io.vdubovsky.kiecustomclient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ExecutorServicesConfiguration {

    @Bean
    public ExecutorService kieExecutorService(){
        return Executors.newCachedThreadPool();
    }
}
