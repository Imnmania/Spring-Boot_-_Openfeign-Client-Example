package me.niloybiswas.openfeignexample.config;

import feign.Logger;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import me.niloybiswas.openfeignexample.interceptor.UserClientInterceptor;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
public class UserClientConfig {

    private final UserClientInterceptor userClientInterceptor;

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.HEADERS;
    }

    @Bean
    public RequestInterceptor customRequestInterceptor() {
        return userClientInterceptor;
    }
}
