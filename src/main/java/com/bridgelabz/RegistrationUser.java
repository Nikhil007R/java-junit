package com.bridgelabz;
import java.util.regex.*;

public class RegistrationUser {

    public void registerUser(String username, String email, String password){
        if( username == null || username.isEmpty()){
            throw new IllegalArgumentException("Username should not be empty");
        }
        if( email == null || !email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+\\.[a-z]{2,}$")){
            throw new IllegalArgumentException("Invalid email format");
        }
        if( password == null || password.length() < 8){
            throw new IllegalArgumentException("password should be greater than 8");
        }
    }
}
