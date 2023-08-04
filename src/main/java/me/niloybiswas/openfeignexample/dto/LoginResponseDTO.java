package me.niloybiswas.openfeignexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {
    private String access_token;
    private String refresh_token;
    private String user_name;
}
