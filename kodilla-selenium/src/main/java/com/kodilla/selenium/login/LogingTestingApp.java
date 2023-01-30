package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogingTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/login");

        WebElement inputField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        inputField.sendKeys("test@kodilla.com");
        WebElement passwordField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passwordField.sendKeys("kodilla123");
        WebElement loginButton = driver.findElement(By.xpath("//html/body/section/form/button"));
        loginButton.submit();
    }
}
