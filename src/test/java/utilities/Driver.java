package utilities;

import com.codeborne.selenide.Configuration;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public abstract class Driver {

    private Driver() {
    }

    public static void getDriver(String url) {

        Configuration.browser = "chrome";
        Configuration.baseUrl = url;
        Configuration.holdBrowserOpen = true;

        open("/");
        webdriver().driver().getWebDriver().manage().window().maximize();
        webdriver().driver().getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void waitFor(int sn){

        sleep(sn*1000);
    }
}
