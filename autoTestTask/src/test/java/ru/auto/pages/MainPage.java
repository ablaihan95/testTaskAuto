package ru.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
     private WebDriver driver;
        private WebDriverWait wait;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 4);
    }
    /*private WebDriverWait wait = new WebDriverWait(driver, 10);*/
    @FindBy(css = ".GeoSelect__title-shrinker")
    WebElement regionSpan;
    @FindBy(css = ".IndexMarks__show-all")
    WebElement allMarks;


    public WelcomePage waitMainPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Index__title-h1")));
        return new WelcomePage(driver);
    }

    public MainPage openRegionsBox() {
        regionSpan.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class= 'RichInput GeoSelectPopup']")));
        return this;
    }

    public MainPage showAllMarks() {
        allMarks.click();
        return this;
    }

    public MarkPage pickMark(String mark) {
        driver.findElement(By.xpath("//div[contains(text(), '"+mark+"')]")).click();
        //TODO bug не подгружает визуально на странице
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ListingHead__title")));
        return new MarkPage(driver);
    }





}
