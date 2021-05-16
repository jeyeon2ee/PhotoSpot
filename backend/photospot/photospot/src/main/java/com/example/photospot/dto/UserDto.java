package com.example.photospot.dto;


import java.time.DateTimeException;

import com.example.photospot.entity.User;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {


    private int user_id;
    private String id;
    private String pwd;
    private String name;
    private String email;
    private  LocalDate regdate;

    public User toEntity(){

        return User.builder().id(user_id).id(id).pwd(pwd).email(email).regdate(regdate);
    }
    @Builder
    public UserDto(int user_id, String id, String pwd, String name, String email, LocalDate regdate){
        this.user_id=user_id;
        this.id=id;
        this.pwd=pwd;
        this.name=name;
        this.email=email;
        this.regdate=regdate;
    }

}
