package com.kodilla.selenium.pom;

public class KodillaPomApplication {
    public static void main(String[] args) {
        KodillaLoginPomOop loginPomOop = new KodillaLoginPomOop();
        loginPomOop.login("test@kodilla.com", "kodilla123");
    }
}
