package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StorePomApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        StorePom store = new StorePom(driver);
        int elementsNumber = store.findPhrasesNumber("ala ma kota");
        System.out.println(String.valueOf(elementsNumber));
        driver.close();
    }
}