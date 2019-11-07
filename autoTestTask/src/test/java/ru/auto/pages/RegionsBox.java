package ru.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.auto.settings.Wait;

import static ru.auto.settings.Wait.waitVisibilityOfElementByCss;

public class RegionsBox {
    WebDriver driver;


    public RegionsBox(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class= 'RichInput GeoSelectPopup']//input")
    WebElement inputRegions;
    @FindBy(xpath = "//*[contains(text(), 'Сохранить')]")
    WebElement saveRegion;

    public RegionsBox findRegion(String region) {
        inputRegions.sendKeys(region);
        driver.findElement(By.xpath("//div[@class= 'RichInput__suggest']//div[text()='"+region+"']")).click();
        waitVisibilityOfElementByCss(".GeoSelectPopup__regions");

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
