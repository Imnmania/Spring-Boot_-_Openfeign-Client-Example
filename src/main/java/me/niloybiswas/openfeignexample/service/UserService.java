package me.niloybiswas.openfeignexample.service;

import lombok.RequiredArgsConstructor;
import me.niloybiswas.openfeignexample.client.AuthClient;
import me.niloybiswas.openfeignexample.client.UserClient;
import me.niloybiswas.openfeignexample.dto.LoginRequestDTO;
import me.niloybiswas.openfeignexample.dto.LoginResponseDTO;
import me.niloybiswas.openfeignexample.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserClient userClient;
//    private final AuthClient authClient;

    public List<UserDTO> getUserList() {
//        final LoginResponseDTO loginResponseDTO = authClient.userLogin(new LoginRequestDTO("john", "1234"));
//        List<UserDTO> userList = userClient.getUserList("Bearer " + loginResponseDTO.getAccess_token());
        return userClient.getUserList();
    }

}
