package com.kodilla.selenium.pom.homework.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResult extends AbstractPom{
    public GoogleResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
