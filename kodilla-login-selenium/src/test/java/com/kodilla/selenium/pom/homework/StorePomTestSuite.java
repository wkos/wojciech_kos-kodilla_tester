package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StorePomTestSuite {
    StorePom store;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        store = new StorePom(driver);
    }

    @ParameterizedTest
    @CsvSource({"NoteBook, 2", "School, 1", "Brand, 1","Bussines, 1", "Gaming, 1", "Powerful, 0"})
    public void shouldFindElementsForGivenPhrases(String phrase, int expectedElementsNumber) throws InterruptedException {
        int elementsNumber = store.findPhrasesNumber(phrase);
        assertEquals(expectedElementsNumber, elementsNumber);
    }

    @ParameterizedTest
    @CsvSource({"noteBook, 2", "schOOL, 1", "BRANd, 1","BUSSINES, 1", "gaming, 1", "powerful, 0"})
    public void shouldFindElementsForGivenPhrasesIndependentlyFromCharacterCase(String phrase, int expectedElementsNumber) throws InterruptedException {
        int elementsNumber = store.findPhrasesNumber(phrase);
        assertEquals(expectedElementsNumber, elementsNumber);
    }
    @AfterEach
    public void testDown() {
        driver.close();
    }

}