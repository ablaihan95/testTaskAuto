package ru.auto.testRunner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class someTest {
    WebDriver driver;
    @Test
    @DisplayName("name")
    void getMethod() {
        System.setProperty("webdriver.chrome.driver" , "D:\\tests\\TestCases\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bootstrap-4.ru/docs/4.0/components/carousel/");
    }
}
