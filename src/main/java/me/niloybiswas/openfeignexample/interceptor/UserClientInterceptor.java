package me.niloybiswas.openfeignexample.interceptor;

import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import me.niloybiswas.openfeignexample.client.AuthClient;
import me.niloybiswas.openfeignexample.dto.LoginRequestDTO;
import me.niloybiswas.openfeignexample.dto.LoginResponseDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
@RequiredArgsConstructor
public class UserClientInterceptor implements RequestInterceptor{

    private final AuthClient authClient;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("myHeaderKey", "myHeader Value");
        final LoginResponseDTO loginResponseDTO = authClient.userLogin(new LoginRequestDTO("john", "1234"));
        requestTemplate.header("Authorization", "Bearer " + loginResponseDTO.getAccess_token());
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.HEADERS;
    }
}
