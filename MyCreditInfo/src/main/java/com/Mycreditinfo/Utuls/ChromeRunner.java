package com.Mycreditinfo.Utuls;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.sleep;

public class ChromeRunner {
    @BeforeTest (description = "Configure browser before tests")
    public static void setUp(){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://new.mycreditinfo.ge/";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver");
        Configuration.startMaximized = true;
        Selenide.open("https://new.mycreditinfo.ge/");
        sleep(3000);
    }
    @AfterTest
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();

    }
}
