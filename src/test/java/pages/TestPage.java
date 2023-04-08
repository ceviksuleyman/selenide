package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestPage {

    //    This is my TestCenter page class
    //    All objects ib TestCenter page will go here
    //    LOCATION THE ELEMENT USING FUNCTION
    //    public SelenideElement username(){
    //        return $(By.id("exampleInputEmail1"));
    //    }
    //    OR ALTERNATIVELY
    //    WebElement -> SelenideElement
    public SelenideElement username = $(By.id("exampleInputEmail1"));
    public SelenideElement password = $(By.id("exampleInputPassword1"));
    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement logOutLink = $(By.partialLinkText("Logout"));
    //    LOCATING CHECKBOXES
    public SelenideElement checkbox1 = $(By.id("box1"));
    public SelenideElement checkbox2 = $(By.id("box2"));
    //    LOCATIONS RADIOS
    public SelenideElement red = $(By.id("red"));
    public SelenideElement yellow = $(By.id("yellow"));
    public SelenideElement football = $(By.id("football"));

    //    LOCATING DROPDOWN ELEMENTS
    public SelenideElement year = $(By.id("year"));
    public SelenideElement month = $(By.id("month"));
    public SelenideElement day = $(By.id("day"));
    public ElementsCollection allStates = $$(By.xpath("//select[@id='state']//option"));

    //    ALERT ELEMENTS
    public SelenideElement jsPromptButton = $(By.xpath("//button[@onclick='jsPrompt()']"));
    public SelenideElement result = $(By.id("result"));

    //    FRAMES
    public SelenideElement pageHader = $(By.xpath("//h3"));
    public SelenideElement backToTechpro = $(By.xpath("//a[@type='button']"));
}
