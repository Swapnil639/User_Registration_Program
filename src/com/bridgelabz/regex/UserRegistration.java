package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner=new Scanner(System.in);

    public void firstName(){
        System.out.println("Enter first name:");
        String firstName=scanner.next();
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher matcher=pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid Name please try again");
            firstName();
        }
    }
    public void lastName(){
        System.out.println("Enter last name:");
        String lastName=scanner.next();
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher matcher=pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid Name please try again");
            lastName();
        }
    }
    public void emailId(){
        System.out.println("Enter the Email Id:");
        String email=scanner.next();
        Pattern pattern=Pattern.compile("^[a-z0-9]{2,}+@[a-z]{2,}+.[a-z]{2,}$");
        Matcher matcher=pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid email please try again");
            emailId();
        }
    }
    public void phoneNumber() {
        System.out.println("Enter the Phone Number with Country Code ");
        String phoneNumber = scanner.next();
        Pattern pattern=Pattern.compile("^[+0-9]{2,}+-[0-9]{10}$");
        Matcher matcher=pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid Phone Number Please try Again");
            phoneNumber();
        }
    }
}
