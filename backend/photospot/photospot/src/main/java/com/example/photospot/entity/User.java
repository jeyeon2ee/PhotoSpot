package com.example.photospot.entity;

//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    @NotNull
    @Column(name = "id")
    private String id;

    @NotNull
    @Column(name = "pwd")
    private String pwd;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "email")
    private String email;

    @Column(name = "Regdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate regdate;

    @Builder
    public User(@NotNull String id, @NotNull String pwd, @NotNull String name, @NotNull String email ) {

        this.id=id;
        this.pwd=pwd;
        this.name=name;
        this.email=email;
        regdate=LocalDate.now();

    }
}
