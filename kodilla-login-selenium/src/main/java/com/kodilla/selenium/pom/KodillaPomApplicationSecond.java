package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomApplicationSecond {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaLoginPomOopSecond loginPom = new KodillaLoginPomOopSecond(driver);
        loginPom.login("test@kodilla.com", "haslo");
        driver.close();
    }
}
