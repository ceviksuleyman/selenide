package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import pages.AmazonPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps {

    // $(".loading_progress").should(disappear); // Waits until element disappears
    // $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text

    @Given("navigate to {string}")
    public void navigateTo(String url) {

        Configuration.browser = "chrome";
        Configuration.baseUrl = url;
        /*Configuration.browserSize = "1440x800";
        Configuration.browserPosition = "10x10"; //default*/

        open("/");
        webdriver().driver().getWebDriver().manage().window().maximize();
        webdriver().driver().getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        $("[name='q']").shouldBe(empty);// TextBox'ın bos oldugunu dogrular
        $("[name='q']").val("Selenide").pressEnter();// TextBox'ta selenide aratıp enter'a basar
        $("#search").shouldHave(text("selenide.org"));//arama sonucunda selenide.org yazisinin oldugunu test eder
        System.out.println($("[name='q']").isEnabled());
        $("[name='q']").shouldNotBe(empty);// Bos olmadigini dogrular
        $("[name='q']").shouldBe(enabled);// Etkin olmasi gerektigini dogrular
        $("[name='q']").shouldBe(visible);// Gorunur olmasi gerektigini dogrular
    }
}
