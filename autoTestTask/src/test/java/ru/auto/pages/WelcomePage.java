package ru.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ru.auto.settings.Wait.waitVisibilityOfElementByCss;

public class WelcomePage {
    WebDriver driver;

   /* public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }*/

    @FindBy(css = "#confirm-button")
    WebElement acceptButton;

    public WelcomePage confirmEntry() throws InterruptedException {
        Thread.sleep(1000);
        waitVisibilityOfElementByCss(String.valueOf(acceptButton));
        acceptButton.click();
        return this;
    }
}
