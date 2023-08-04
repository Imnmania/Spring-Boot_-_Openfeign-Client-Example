package me.niloybiswas.openfeignexample.client;

import me.niloybiswas.openfeignexample.dto.LoginRequestDTO;
import me.niloybiswas.openfeignexample.dto.LoginResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "AuthClient", url = "http://localhost:9093")
public interface AuthClient {

    @PostMapping("/api/login")
    LoginResponseDTO userLogin(@RequestBody LoginRequestDTO data);

}
