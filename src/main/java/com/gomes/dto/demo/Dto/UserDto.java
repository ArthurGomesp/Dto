package com.gomes.dto.demo.Dto;


import com.gomes.dto.demo.Entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class UserDto {

    private Long id;
    private String nome;

    public UserDto(User user) {
        id = user.getId();
        nome = user.getName();
    }


}
