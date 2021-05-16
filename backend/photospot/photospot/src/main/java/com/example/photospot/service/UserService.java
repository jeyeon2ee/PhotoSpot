package com.example.photospot.service;

import com.example.photospot.dto.UserDto;
import com.example.photospot.entity.User;
import com.example.photospot.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public Long SignUp(UserDto userDto){

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(userDto.toEntity()).getId();

    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 로그인을 하기 위해 가입된 user정보를 조회하는 메서드
        Optional<Member> memberWrapper = memberRepository.findByusername(username);
        Member member = memberWrapper.get();

        List<GrantedAuthority> authorities = new ArrayList<>();

        if("admin".equals(username)){
            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        } else {
            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
        }

        // 아이디, 비밀번호, 권한리스트를 매개변수로 User를 만들어 반환해준다.
        return new User(member.getUsername(), member.getPassword(), authorities);
    }
}



