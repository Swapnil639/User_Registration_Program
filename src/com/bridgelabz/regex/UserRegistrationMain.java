package com.bridgelabz.regex;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.emailId();
        userRegistration.phoneNumber();
        userRegistration.password();
        userRegistration.validEmail();
        userRegistration.invalidEmail();

    }
}
