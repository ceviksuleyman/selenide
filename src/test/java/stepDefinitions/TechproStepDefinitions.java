package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TestPage;
import utilities.Driver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.title;

public class TechproStepDefinitions {

    TestPage testPage = new TestPage();

    @Given("I get the title of the current page and verity if it contains {string}")
    public void i_get_the_title_of_the_current_page_and_verity_if_it_contains(String string) {

        //      getting the title of the page
        Assert.assertTrue(title().contains(string));

        String title = title();
        Assert.assertTrue(title.contains(string));
        System.out.println(title);
    }

    //    Screenshot of programs elements
    @Given("I capture the screenshot of the programs pop up")
    public void i_capture_the_screenshot_of_the_programs_pop_up() {

        testPage.closePopup.click();
        Driver.waitFor(3);
        try {
            testPage.menuBar.screenshot();
        } catch (Exception e) {

        }
    }

    @And("Close browser")
    public void closeBrowser() {

        closeWebDriver();
    }
}
