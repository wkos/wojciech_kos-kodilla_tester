package com.kodilla.selenium.pom.homework.google;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoogleResultTest {
    GoogleSearch googleSearch;
    GoogleResult googleResult;
    WebDriver driver;
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.pl/");
        WebElement cookieElement = driver.findElement(By.id("L2AGLb"));
        cookieElement.click();
    }

    @Test
    public void foundUrlShouldBeEqualsToCurrentUrl()  {
        googleSearch = new GoogleSearch(driver);
        String foundUrl = googleSearch.goAndGetRandomUrl("Babulej i Babulejka");

        googleResult = new GoogleResult(driver);
        String currentUrl = googleResult.getUrl();

        foundUrl = foundUrl.substring(foundUrl.indexOf("//"));
        currentUrl = currentUrl.substring(currentUrl.indexOf("//"));
        assertEquals(foundUrl, currentUrl);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }

}