package com.kodilla.selenium.pom.homework.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleSearch extends AbstractPom {
    @FindBy(css = "input[name=\"q\"]")
    WebElement searchField;
    //    @FindBy(css = "h3[class=\"LC20lb MBeuO DKV0Md\"]")
    @FindBy(css = "div[class=\"yuRUbf\"] > a")
    List<WebElement> foundElements;

    public GoogleSearch(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String goAndGetRandomUrl(String phrase) {
        findLinksWithPhrase(phrase);
        int index = drawIndex();
        WebElement elementFromList = foundElements.get(index);
        String url = elementFromList.getAttribute("href");
        elementFromList.click();
        return url;
    }

    public void findLinksWithPhrase(String phrase) {
        searchField.sendKeys(phrase);
        searchField.sendKeys(Keys.RETURN);
    }

    private int drawIndex() {
        int elementsNumber = foundElements.size();
        Random random = new Random();
        return random.nextInt(elementsNumber);
    }

    public void close() {
        driver.close();
    }
}
