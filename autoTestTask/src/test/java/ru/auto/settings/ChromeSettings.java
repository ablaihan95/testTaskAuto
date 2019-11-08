package ru.auto.settings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeSettings {

    protected WebDriver driver;

    @BeforeEach
    void setUp() {

        System.setProperty("webdriver.chrome.driver" , "D:\\tests\\TestCases\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://auto.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    void close() {
        driver.quit();
    }
}
