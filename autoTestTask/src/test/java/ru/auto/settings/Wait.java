package ru.auto.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {

    private static WebDriver driver;
    private static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void waitVisibilityOfElementByCss(String locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public static void waitVisibilityOfElementByXpath(String locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void waitURL(String URL) {
        wait.until(ExpectedConditions.urlToBe(URL));
    }

}
