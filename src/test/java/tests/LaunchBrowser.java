package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LaunchBrowser {

    @Test
    public void launchBrowserTest() {


        Configuration.browser = "chrome";
        //Configuration.headless = true;
        Configuration.baseUrl = "https://www.google.com";
        Configuration.browserSize = "1366x900";
        open("/");

    }
}
