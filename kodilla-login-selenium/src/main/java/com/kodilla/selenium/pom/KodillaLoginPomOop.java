package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPomOop {
    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(css = "button[class*='w-100']")
//    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;
    WebDriver driver;

    public KodillaLoginPomOop() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/login");
    }

    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        String messsage = driver.switchTo().alert().getText();
        System.out.println(messsage);
        driver.switchTo().alert().dismiss();

        String alertText = "Jeste" + "\u015B" + " teraz zalogowany!";
        System.out.println(alertText);
        return alertText.equals(messsage);
    }

    public void close() {
        driver.close();
    }
}
