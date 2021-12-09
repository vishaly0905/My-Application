package com.example.myapplication;

public class UserHelperClass {
    String full_name,mobile,email,pass_word;

    public UserHelperClass() {
    }


    public UserHelperClass(String full_name, String mobile, String email, String pass_word) {
        this.full_name = full_name;
        this.mobile = mobile;
        this.email = email;
        this.pass_word = pass_word;
    }



    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }


}
