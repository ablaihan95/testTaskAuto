package ru.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import ru.auto.settings.Wait;

import java.util.List;

import static ru.auto.settings.Wait.waitVisibilityOfElementByXpath;

public class MarkPage{
    WebDriver driver;

    public MarkPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindAll({@FindBy(css = ".Carousel__item")})
    private List<WebElement> carousel_items;

    @FindBy(xpath = "//span[contains(text(), 'Сортировка')]")
    WebElement sortButton;

    @FindBy(xpath = "//div[contains(text(), 'По цене (дешевле — дороже)')]")
    WebElement cheaperSort;

    @FindBy(css = ".HistoryFilter input")
    WebElement historyFilter;


    public int getSizeCarouselItems() {
        return carousel_items.size();
    }

    public MarkPage getCheaperSort() {
        sortButton.click();
        waitVisibilityOfElementByXpath(String.valueOf(cheaperSort));
        cheaperSort.click();
        return this;
    }

    public MarkPage setHistoryFilter() {
        historyFilter.click();
        return this;
    }
}
