package utility;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public abstract class Driver {

    private Driver() {
    }

    public static void getDriver(String url) {

        Configuration.browser = "chrome";
        Configuration.timeout = 20000;
        Configuration.baseUrl = url;
        Configuration.browserPosition = "0x0";
        Configuration.browserSize = "1540x800";

        open("/");
    }
}
