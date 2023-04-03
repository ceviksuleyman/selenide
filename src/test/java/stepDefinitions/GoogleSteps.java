package stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps {

    // $(".loading_progress").should(disappear); // Waits until element disappears
    // $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text

    @Given("navigate to {string}")
    public void navigateTo(String url) {


        Configuration.browser = "chrome";
        Configuration.baseUrl = url;
        // Configuration.screenshots = true;
        // Configuration.browserSize = "1680x1050";
        open("/");
        sleep(5000);

        $(By.cssSelector("input[title='Ara']")).setValue("Youtube");
        $(By.name("btnK")).click();

        //$(By.cssSelector("center>input.gNO89b[name='btnK']")).click();

        closeWebDriver();
    }
}
