package stepDefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.screenshot;

public class CommonStepDefinitions {

    @Given("I set Configuration.screenshot to false")
    public void i_set_configuration_screenshot_to_false() {
        //        will not take the screenshot even if the test case fails
        Configuration.screenshots = false;
    }

    @Given("I capture the screenshot of the page")
    public void i_capture_the_screenshot_of_the_page() {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss").format(new Date());
        String time = new SimpleDateFormat("HH.mm.ss").format(new Date());
        screenshot("my_screenshot" + time);//OR SIMPLY
        //screenshot(new Date().toString());// giving a dynamic name
    }

    @Given("I open the {string} browser")
    public void iOpenTheBrowser(String browserType) {

        switch (browserType) {
            case "headless":
                Configuration.headless = true;
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
            case "safari":
                Configuration.browser = "safari";
                break;
            case "edge":
                Configuration.browser = "edge";
                break;
            default:
                Configuration.browser = "chrome";
                break;
        }
    }
}
