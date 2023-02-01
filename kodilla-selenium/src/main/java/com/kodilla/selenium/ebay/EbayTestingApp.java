package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EbayTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        Thread.sleep(3000);
        WebElement cookieElement = driver.findElement(By.id("gdpr-banner-accept"));
        cookieElement.click();
//        WebElement inputField = driver.findElement(By.name("_nkw"));
//        inputField.sendKeys("Laptop");
//        inputField = driver.findElement(By.id("gh-btn"));
//        inputField.submit();

        WebElement inputField = driver.findElement(By.cssSelector("input[class=\"gh-tb ui-autocomplete-input\"]"));
        inputField.sendKeys("Laptop");

        inputField = driver.findElement(By.id("gh-btn"));
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("s-item__image-section")));

        List<WebElement> cardElements = driver.findElements(By.className("s-item__info"));
        for(WebElement element : cardElements){
            System.out.println(element.getText());
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
