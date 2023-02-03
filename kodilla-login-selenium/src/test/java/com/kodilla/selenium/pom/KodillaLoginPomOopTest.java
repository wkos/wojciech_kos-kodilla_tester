package com.kodilla.selenium.pom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KodillaLoginPomOopTest {
    KodillaLoginPomOop loginPomOop;

    @BeforeEach
    public void setup(){
        loginPomOop = new KodillaLoginPomOop();
    }

    public void testDown(){
        loginPomOop.close();
    }

    @Test
    public void testLoginPage_CheckErrorValitation(){
        String email = "user@toniedziala.pl";
        String password = "password";
        boolean loggedIn = loginPomOop.login(email, password);
        System.out.println(loggedIn);
        assertFalse(loggedIn);
    }

    @Test
    public void testLoginPage_CheckPositiveValidation(){
        String email = "test@kodilla.com";
        String password = "kodilla123";
        boolean loggedIn = loginPomOop.login(email, password);
        System.out.println(loggedIn);
        assertTrue(loggedIn);
    }
}