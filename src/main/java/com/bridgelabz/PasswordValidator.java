package com.bridgelabz;

public class PasswordValidator {

    // Regular expression for a valid password
    private static final String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        return password.matches(regex);
    }
}
