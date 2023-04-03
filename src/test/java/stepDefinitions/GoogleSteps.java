package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoogleSteps {

    // $(".loading_progress").should(disappear); // Waits until element disappears
    // $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text

    @Given("I navigate to {string}")
    public void ıNavigateTo(String url) {

        open(url);
        sleep(5000);

        $(By.cssSelector("input[title='Ara']")).setValue("Youtube");

        $(By.cssSelector("center>input.gNO89b[name='btnK']")).click();
    }
}
