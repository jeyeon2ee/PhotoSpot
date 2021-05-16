package com.example.photospot.service;

import com.example.photospot.dto.UserDto;
import com.example.photospot.entity.User;
import com.example.photospot.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@NoArgsConstructor
public class UserService implements UserDetailsService{

    private UserRepository repository;


    @Transactional
    public void SingUp(UserDto userDto) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userDto.setPwd(passwordEncoder.encode(userDto.getPwd()));
        repository.save(userDto.toEntity()).getId();
    }

    @Override
    public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException {

        Optional<User> userWrapper= repository.findByid(userid);
        User user = userWrapper.get();

        // 아이디, 비밀번호, User를 만들어 반환해준다.
        return (UserDetails) new User(user.getId(), user.getPwd(),user.getName(),user.getEmail());
    }


}


