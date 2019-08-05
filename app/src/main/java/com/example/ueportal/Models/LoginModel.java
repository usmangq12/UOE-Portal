package com.example.ueportal.Models;

public class LoginModel {

    private String loginEmail;
    private String loginPassword;

    public LoginModel(String loginEmail, String loginPassword) {
        this.loginEmail = loginEmail;
        this.loginPassword = loginPassword;
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

}
