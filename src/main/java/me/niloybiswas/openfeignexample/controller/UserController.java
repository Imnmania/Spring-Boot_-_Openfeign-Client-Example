package me.niloybiswas.openfeignexample.controller;

import lombok.RequiredArgsConstructor;
import me.niloybiswas.openfeignexample.dto.UserDTO;
import me.niloybiswas.openfeignexample.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getUserList() {
        List<UserDTO> userList = userService.getUserList();
        return ResponseEntity.ok().body(userList);
    }

}
