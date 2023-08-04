package me.niloybiswas.openfeignexample.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private int id;
    private String name;
    private String username;
    private List<RoleDTO> roles;
}
