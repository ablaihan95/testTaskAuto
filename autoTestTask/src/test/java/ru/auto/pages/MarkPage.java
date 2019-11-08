package ru.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MarkPage{
    private WebDriver driver;
    private WebDriverWait wait;
    public MarkPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    @FindAll({@FindBy(css = ".Carousel__item")})
    private List<WebElement> carousel_items;

    @FindBy(xpath = "//span[contains(text(), 'Сортировка')]")
    private
    WebElement sortButton;

    @FindBy(xpath = "//div[contains(text(), 'По цене (дешевле — дороже)')]")
    private
    WebElement cheaperSort;

    @FindBy(css = ".HistoryFilter input")
    private
    WebElement historyFilter;

    public int getSizeCarouselItems() {
        return carousel_items.size();
    }

    public MarkPage getCheaperSort() {
        sortButton.click();
        cheaperSort.click();
        return this;
    }

    public MarkPage setHistoryFilter() {
        historyFilter.click();
        return this;
    }
}
