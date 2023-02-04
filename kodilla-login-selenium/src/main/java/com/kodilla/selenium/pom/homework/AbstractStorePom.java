package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public abstract class AbstractStorePom {
    protected WebDriver driver;
    public AbstractStorePom(WebDriver driver) {
        this.driver = driver;
    }
}
