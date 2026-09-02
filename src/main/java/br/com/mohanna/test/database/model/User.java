package br.com.mohanna.test.database.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

    private Integer id;
    private String name;
    private String cpf;
    private String email;
}
