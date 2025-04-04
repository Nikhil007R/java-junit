package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class RegistrationUserTest {

    private RegistrationUser register;

    @BeforeEach
    void setUp(){
        register = new RegistrationUser();
    }

    @Test
    void validUsername() {
        assertDoesNotThrow(()-> register.registerUser("Nikhil Rawat", "nikhilrawaa311@gmail.com", "12345678"));
    }
    @Test
    void invalidUsername() {
        assertThrows(IllegalArgumentException.class, ()-> register.registerUser("", "nikhilrawaa311@gmail.com", "12345678"));
    }

    @Test
    void invalidEmail(){
        assertThrows(IllegalArgumentException.class, ()-> register.registerUser("nikhil", "nikhilrawaa311@gmail...com", "12345678"));
        assertThrows(IllegalArgumentException.class, ()-> register.registerUser("nikhil", "nikhil%rawaa311@gmail.com", "12345678"));
    }

    @Test
    void invalidPassword() {
        assertThrows(IllegalArgumentException.class, ()-> register.registerUser("nikhilrawat", "nikhilrawaa311@gmail.com", "N"));
    }
}