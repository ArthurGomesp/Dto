package com.gomes.dto.demo.Services;


import com.gomes.dto.demo.Dto.UserDto;
import com.gomes.dto.demo.Entities.User;
import com.gomes.dto.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;

    public UserDto findById(Long id){
        User entity =repository.findById(id).get();
        UserDto dto= new UserDto(entity);
        return dto;
    }
}
