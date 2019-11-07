package ru.auto.testRunner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ru.auto.pages.MainPage;
import ru.auto.pages.MarkPage;
import ru.auto.pages.RegionsBox;
import ru.auto.pages.WelcomePage;
import ru.auto.settings.ChromeSettings;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends ChromeSettings {

   static WebDriver driver;
    MainPage mainPage = new MainPage(driver);
    RegionsBox regionsBox = PageFactory.initElements(driver, RegionsBox.class);
    MarkPage markPage = PageFactory.initElements(driver, MarkPage.class);
    WelcomePage welcomePage = PageFactory.initElements(driver, WelcomePage.class);
    @Test
    void runTestCase() throws InterruptedException {
        welcomePage.confirmEntry();
        mainPage.openRegionsBox();
        regionsBox.findRegion("Москва")
                .findRegion("Ярославль")
                .removeRegion("Москва")
                .saveRegion();
        mainPage.showAllMarks()
                .pickMark("Fiat");
        assertEquals(43, markPage.getSizeCarouselItems());
        markPage.getCheaperSort()
                .setHistoryFilter();
    }
}
