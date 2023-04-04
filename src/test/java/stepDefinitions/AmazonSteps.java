package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;


public class AmazonSteps {

    @Given("i navigate to {string}")
    public void iNavigateTo(String url) {

        Driver.getDriver(url);
    }
}
