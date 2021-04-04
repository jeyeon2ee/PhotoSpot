package com.example.photospot.dto;


import java.time.DateTimeException;
import java.time.LocalDate;

public class UserForm {


    private int user_id;
    private String id;
    private String pwd;
    private String name;
    private String email;
    private  LocalDate regdate;

    public static class builder {
        private String id;
        private String pwd;
        private String name;
        private String email;
        private LocalDate regdate;

        public builder() {

        }

        public builder id(String id) {
            this.id = id;
            return this;
        }
        public builder pwd( String pwd) {
            this.pwd = pwd;
            return this;
        }
        public builder name(String name) {
            this.name = name;
            return this;
        }
        public builder email(String email) {
            this.email = email;
            return this;
        }
        public builder regdate(LocalDate regdate) {
            this.regdate = regdate;
            return this;
        }

        public UserForm build() {
            UserForm userForm = new UserForm(this.id, this.pwd);
            userForm.name = this.name;
            userForm.email = this.email;
            userForm.regdate = this.regdate;
            return userForm;
        }
    }




}
