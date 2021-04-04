package com.example.photospot.entity;

//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;

import com.sun.istack.NotNull;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_id")
    private long num_id;

    @NotNull
    @Column(name = "id")
    private char id;

    @NotNull
    @Column(name = "pwd")
    private char pwd;

    @NotNull
    @Column(name = "name")
    private char name;

    @NotNull
    @Column(name = "email")
    private char email;

    @Column(name = "Regdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate regdate;



    public User(@NotNull char id, @NotNull char pwd, @NotNull char name, @NotNull char email ) {

        this.id=id;
        this.pwd=pwd;
        this.name=name;
        this.email=email;

        regdate=LocalDate.now();


    }
}
