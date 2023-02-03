package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom {
    @FindBy(css = "input[type='email']")
    static WebElement emailField;

    @FindBy(css = "input[type='password']")
    static WebElement passwordField;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");

//        WebElement inputField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
//        inputField.sendKeys("testuser@gmail.com");
//        inputField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
//        inputField.sendKeys("Haslo");

        PageFactory.initElements(driver, KodillaLoginPom.class);
        emailField.sendKeys("testuser@gmail.com");
        passwordField.sendKeys("Haslo");
        driver.close();
    }
}
