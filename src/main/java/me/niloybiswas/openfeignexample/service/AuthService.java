package me.niloybiswas.openfeignexample.service;

import lombok.RequiredArgsConstructor;
import me.niloybiswas.openfeignexample.client.AuthClient;
import me.niloybiswas.openfeignexample.dto.LoginRequestDTO;
import me.niloybiswas.openfeignexample.dto.LoginResponseDTO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthClient authClient;

    public LoginResponseDTO userLogin(LoginRequestDTO data) {
        return authClient.userLogin(data);
    }
}
