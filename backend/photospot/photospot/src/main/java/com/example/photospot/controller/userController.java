package com.example.photospot.controller;

import com.example.photospot.dto.UserDto;
import com.example.photospot.dto.UserForm;
import com.example.photospot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    private final UserService userService;

    public userController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/SignUp")
    public String singup(UserDto userDto){
        userService.SingUp(userDto);
        return "redirect:/";
    }

    @GetMapping("/Login")
    public String login(){
        return "/loginForm";
    }




}
