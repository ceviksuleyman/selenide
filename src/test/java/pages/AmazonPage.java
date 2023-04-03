package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AmazonPage {

    public SelenideElement searchBox = $(By.id("twotabsearchtextbox"));
}
