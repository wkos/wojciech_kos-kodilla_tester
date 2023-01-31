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

        WebElement cookieElement = driver.findElement(By.xpath("//button[@data-role=\"accept-consent\"]"));
        cookieElement.click();

        WebElement categoryElement = driver.findElement(By.xpath("//div[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select"));
        Select categorySelect = new Select(categoryElement);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement inputElement = driver.findElement(By.xpath("//input[@name=\"string\"]"));
        inputElement.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-role=\"search-button\"]"));
        searchButton.submit();
    }
}
