package me.niloybiswas.openfeignexample.client;

import me.niloybiswas.openfeignexample.config.PostClientConfig;
import me.niloybiswas.openfeignexample.config.UserClientConfig;
import me.niloybiswas.openfeignexample.dto.UserDTO;
import me.niloybiswas.openfeignexample.interceptor.UserClientInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "UserClient", url = "http://localhost:9093", configuration = UserClientInterceptor.class)
public interface UserClient {

    @GetMapping("/api/users")
    public List<UserDTO> getUserList(/*@RequestHeader("Authorization") String token*/);

}
