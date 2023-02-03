package com.kodilla.selenium.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPomOopSecond extends AbstractPom{
    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(css = "button[class*='w-100']")
//    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    public KodillaLoginPomOopSecond(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean login(String email, String password) throws InterruptedException {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        Alert alert = driver.switchTo().alert();
        String messsage = alert.getText();
        alert.dismiss();

        String alertText = "Jeste" + "\u015B" + " teraz zalogowany!";
        return messsage.equals(alertText);
    }

    public void close() {
        driver.close();
    }
}