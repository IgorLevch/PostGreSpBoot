package com.example.sbPostgre.controller;

import com.example.sbPostgre.entity.EmployeeEntity;
import com.example.sbPostgre.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public EmployeeEntity getUser(@PathVariable("id") Long id){


            return  userService.getUserById(id);

    }


}
