package com.example.photospot.service;

import com.example.photospot.dto.UserForm;
import com.example.photospot.entity.User;
import com.example.photospot.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional

public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Integer CreateUser(UserForm form){
        User user = form.toEntity();
        userRepository.save(user);
        return user.user_id();
    }

}



