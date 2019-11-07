package ru.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.auto.settings.Wait;

import static ru.auto.settings.Wait.*;

public class MainPage {
     private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    /*private WebDriverWait wait = new WebDriverWait(driver, 10);*/
    @FindBy(css = ".GeoSelect__title-shrinker")
    WebElement regionSpan;
    @FindBy(css = ".IndexMarks__show-all")
    WebElement allMarks;


    public MainPage waitMainPage() {
        waitVisibilityOfElementByCss(".Index__title-h1");
        return this;
    }

    public MainPage openRegionsBox() {
        regionSpan.click();
        waitVisibilityOfElementByXpath("//div[@class= 'RichInput GeoSelectPopup']");
        return this;
    }

    public MainPage showAllMarks() {
        allMarks.click();
        return this;
    }

    public void pickMark(String mark) {
        driver.findElement(By.xpath("//div[contains(text(), '"+mark+"')]")).click();
        waitURL("https://auto.ru/cars/fiat/all/");
    }





}
