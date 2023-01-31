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
        Thread.sleep(5000);

        WebElement categoryElement = driver.findElement(By.xpath("//div[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select"));
        Select categorySelect = new Select(categoryElement);
        categorySelect.selectByValue("/kategoria/elektronika");
        WebElement inputElement = driver.findElement(By.xpath("//input[@class=\"msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_Y5CDc\"]"));
//        WebElement searchElement = driver.findElement(By.xpath("//input[@name=\"string\"]"));
        System.out.println(inputElement.getTagName());
        System.out.println(inputElement.getSize());
//        inputElement.click();
        inputElement.submit();
        inputElement.sendKeys("Mavic mini");
        WebElement searchButton = driver.findElement(By.xpath("//button[@data-role=\"search-button\"]"));
        searchButton.submit();
    }
}
