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
}
