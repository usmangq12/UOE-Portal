package com.example.ueportal.Models;

public class RegisterModel {

    private String registerFirstName;
    private String regsiterLastName;
    private String regsiterRollNumber;
    private String regsiterEmail;
    private String regsiterPassword;
    private String regsiterConfirmPassword;

    public RegisterModel(String registerFirstName, String regsiterLastName, String regsiterRollNumber, String regsiterEmail, String regsiterPassword, String regsiterConfirmPassword) {
        this.registerFirstName = registerFirstName;
        this.regsiterLastName = regsiterLastName;
        this.regsiterRollNumber = regsiterRollNumber;
        this.regsiterEmail = regsiterEmail;
        this.regsiterPassword = regsiterPassword;
        this.regsiterConfirmPassword = regsiterConfirmPassword;
    }

    public String getRegisterFirstName() {
        return registerFirstName;
    }

    public void setRegisterFirstName(String registerFirstName) {
        this.registerFirstName = registerFirstName;
    }

    public String getRegsiterLastName() {
        return regsiterLastName;
    }

    public void setRegsiterLastName(String regsiterLastName) {
        this.regsiterLastName = regsiterLastName;
    }

    public String getRegsiterRollNumber() {
        return regsiterRollNumber;
    }

    public void setRegsiterRollNumber(String regsiterRollNumber) {
        this.regsiterRollNumber = regsiterRollNumber;
    }

    public String getRegsiterEmail() {
        return regsiterEmail;
    }

    public void setRegsiterEmail(String regsiterEmail) {
        this.regsiterEmail = regsiterEmail;
    }

    public String getRegsiterPassword() {
        return regsiterPassword;
    }

    public void setRegsiterPassword(String regsiterPassword) {
        this.regsiterPassword = regsiterPassword;
    }

    public String getRegsiterConfirmPassword() {
        return regsiterConfirmPassword;
    }

    public void setRegsiterConfirmPassword(String regsiterConfirmPassword) {
        this.regsiterConfirmPassword = regsiterConfirmPassword;
    }

}
