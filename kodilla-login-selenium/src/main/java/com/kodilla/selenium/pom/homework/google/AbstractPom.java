package com.kodilla.selenium.pom.homework.google;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPom {
    protected WebDriver driver;
    public AbstractPom(WebDriver driver) {
        this.driver = driver;
    }
}
