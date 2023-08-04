package me.niloybiswas.openfeignexample.controller;

import lombok.RequiredArgsConstructor;
import me.niloybiswas.openfeignexample.dto.LoginRequestDTO;
import me.niloybiswas.openfeignexample.dto.LoginResponseDTO;
import me.niloybiswas.openfeignexample.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody LoginRequestDTO data) {
        final LoginResponseDTO response = authService.userLogin(data);
        return ResponseEntity.ok().body(response);
    }

}
