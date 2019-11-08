package ru.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {
    private WebDriver driver;
    public WelcomePage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(css = "#confirm-button")
    private WebElement acceptButton;

    public MainPage confirmEntry() {

        acceptButton.click();
    return new MainPage(driver);
    }
}
