package me.niloybiswas.openfeignexample.config;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class PostClientConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return  requestTemplate -> {
            requestTemplate.header("Custom-Value", "I am custom value");
        };
    }
}
