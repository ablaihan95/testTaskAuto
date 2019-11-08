package ru.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegionsBox {
    WebDriver driver;
    WebDriverWait wait;

    public RegionsBox(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    @FindBy(xpath = "//div[@class= 'RichInput GeoSelectPopup']//input")
    WebElement inputRegions;
    @FindBy(xpath = "//*[contains(text(), 'Сохранить')]")
    WebElement saveRegion;

    public RegionsBox findRegion(String region) {
        inputRegions.sendKeys(region);
        driver.findElement(By.xpath("//div[@class= 'RichInput__suggest']//div[text()='"+region+"']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".GeoSelectPopup__regions")));

        return this;
    }

    public RegionsBox removeRegion(String region) {
        driver.findElement(By.xpath("//div[@class= 'GeoSelectPopup__regions']//*[contains(text(), '"+region+"')]")).click();
        return this;
    }

    public RegionsBox saveRegion() {
        saveRegion.click();
        return this;
    }
}
