package stepDefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import pages.AmazonPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps {

    // $(".loading_progress").should(disappear); // Waits until element disappears
    // $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text

    @Given("navigate to {string}")
    public void navigateTo(String url) {


        Configuration.browser = "chrome";
        Configuration.baseUrl = url;
        Configuration.browserSize = "1440x800";
        Configuration.browserPosition = "10x10"; //default
        Configuration.timeout = 30000;


        open("/");
        sleep(5000);

        AmazonPage amazonPage = new AmazonPage();
        //amazonPage.searchBox.setValue("MSI Laptop").;

        $(By.id("twotabsearchtextbox")).setValue("MSI Laptop");

        $(By.id("twotabsearchtextbox")).shouldHave(visible);

        $(By.id("nav-search-submit-button")).click();

        refresh();
    }
}
