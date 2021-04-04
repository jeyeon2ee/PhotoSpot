package com.example.photospot.controller;

import com.example.photospot.dto.UserForm;
import com.example.photospot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    private final UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/SignUp")
    public String createUser(@Validated UserForm form, BindingResult result){

        if(result.hasErrors()){
            return "/error";
        }

        UserService.CreateUser(form);

        return "/main";

    }


}
