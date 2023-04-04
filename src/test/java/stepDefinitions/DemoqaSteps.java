package stepDefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.codeborne.selenide.Selenide.*;

public class DemoqaSteps {

    @When("new tab navigate to {string}")
    public void newTabNavigateTo(String url) {


        sleep(4000);

        Selenide.switchTo().newWindow(WindowType.TAB).get(url);
        refresh();
        Configuration.timeout = 30000;


        List<String> windows = new ArrayList<>(Selenide.webdriver().object().getWindowHandles());

        switchTo().window(windows.get(0));
        closeWindow();
        sleep(3000);
        closeWebDriver();
    }
}
