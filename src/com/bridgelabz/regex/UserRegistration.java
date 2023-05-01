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
    public void password() {
        System.out.println("Enter the Password ");
        String password = scanner.next();
        Pattern pattern=Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher matcher=pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid Password Please try Again");
            password();
        }
    }
    public void validEmail(){
        System.out.println("Valid Emails following below :");
        boolean b1 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,},", "abc@yahoo.com,");
        System.out.println("b1 :" + b1);
        boolean b2 = Pattern.matches("[a-z]{3,}-\\d{2,}@[a-z]{2,}.[a-z]{3,},", "abc-100@yahoo.com,");
        System.out.println("b2 :" + b2);
        boolean b3 = Pattern.matches("[a-z]{3,}.\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc.100@yahoo.com");
        System.out.println("b3 :" + b3);
        boolean b4 = Pattern.matches("[a-z]{3,}\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc111@abc.com");
        System.out.println("b4 :" + b4);
        boolean b5 = Pattern.matches("[a-z]{3,}-\\d{2,}@[a-z]{2,}.[a-z]{3,},", "abc-100@abc.net,");
        System.out.println("b5 :" + b5);
        boolean b6 = Pattern.matches("[a-z]{3,}.\\d{2,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc.100@abc.com.au");
        System.out.println("b6 :" + b6);
        boolean b7 = Pattern.matches("[a-z]{3,}@\\d.[a-z]{2,}", "abc@1.com");
        System.out.println("b7 :" + b7);
        boolean b8 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{3,}", "abc@gmail.com.com");
        System.out.println("b8 :" + b8);
        boolean b9 = Pattern.matches("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc+100@gmail.com");
        System.out.println("b9 :" + b9);


    }
    public void invalidEmail(){
        System.out.println("Invalid Emails following below :");
        boolean a1 = Pattern.matches("[a-z]{4,}@[a-z].[a-z]{2,}", "abc");  // must contains “@” symbol
        System.out.println("a1 :" + a1);
        boolean a2 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@.com.my"); //tld can not start with dot “.”
        System.out.println("a2 :" + a2);
        boolean a3 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]", "abc123@.gmail.a");// “.a” is not a valid tld, last tld must contain at least two characters
        System.out.println("a3 :" + a3);
        boolean a4 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com"); // tld can not start with dot “.”
        System.out.println("a4 :" + a4);
        boolean a5 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com.com");//tld can not start with dot “.”
        System.out.println("a5 :" + a5);
        boolean a6 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", ".abc@abc.com"); //email’s 1st character can not start with “.”
        System.out.println("a6 :" + a6);
        boolean a7 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc()*@gmail.com");//email’s is only allow character, digit, underscore and dash
        System.out.println("a7 :" + a7);
        boolean a8 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc@%*.com");// email’s tld is only allow character and digit
        System.out.println("a8 :" + a8);
        boolean a9 = Pattern.matches("[a-z\\d]{3,}@[a-z]{3,}.[a-z]{2,}", "abc..2002@gmail.com");//double dots “.” are not allow
        System.out.println("a9 :" + a9);
        boolean a10 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc.@gmail.com");// email’s last character can not end with dot “.”
        System.out.println("a10 :" + a10);
        boolean a11 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@abc@gmail.com");//double “@” is not allow
        System.out.println("a11 :" + a11);
        boolean a12 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.1a");//email’s tld which has two characters can not contains digit
        System.out.println("a12 :" + a12);
        boolean a13 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.aa.au");//cannot have multiple email’s tld
        System.out.println("a13 :" + a13);
    }
}
