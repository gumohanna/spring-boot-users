package br.com.mohanna.test.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {

    private String name;
    private String cpf;
    private String email;
}
