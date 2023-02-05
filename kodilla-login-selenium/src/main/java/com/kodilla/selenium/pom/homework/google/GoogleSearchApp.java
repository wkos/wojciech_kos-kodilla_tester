package com.kodilla.selenium.pom.homework.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.pl/");
        WebElement cookieElement = driver.findElement(By.id("L2AGLb"));
        cookieElement.click();

        GoogleSearch search = new GoogleSearch(driver);
        System.out.println(search.goAndGetRandomUrl("Babulej i babulejka"));
        Thread.sleep(2000);
        GoogleResult resultPage = new GoogleResult(driver);
        System.out.println(resultPage.getUrl());
//        driver.close();
    }
}
