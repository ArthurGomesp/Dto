package com.gomes.dto.demo.Controllers;


import com.gomes.dto.demo.Dto.UserDto;
import com.gomes.dto.demo.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServices services;

    @GetMapping(value = "/{id}")
    public UserDto findbyId(@PathVariable Long id){
        return services.findById(id);
    }
}
