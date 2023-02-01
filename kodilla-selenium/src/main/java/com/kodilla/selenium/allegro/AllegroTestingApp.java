package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        Thread.sleep(1000);
        WebElement cookieElement = driver.findElement(By.className("msts_enp"));
        cookieElement.click();

        Thread.sleep(4000);
        WebElement categoryElement = driver.findElement(By.tagName("select"));
        Select categorySelect = new Select(categoryElement);
        Thread.sleep(2000);
        categorySelect.selectByValue("/kategoria/elektronika");

        Thread.sleep(2000);
        WebElement inputElement = driver.findElement(By.tagName("input"));
        Thread.sleep(2000);
        inputElement.sendKeys("Mavic mini");

        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.cssSelector("form > button"));
        Thread.sleep(2000);
        searchButton.click();
    }
}
