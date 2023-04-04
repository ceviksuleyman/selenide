package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:test-output/default-cucumber-reports.html",
                "json:test-output/json-reports/cucumber.json",
                "junit:test-output/xml-report/cucumber.xml",
        },
        publish = true,
        features = "./src/test/resources/features",
        glue = {"stepDefinitions"},
        dryRun = false,
        tags = "@driver"
)
public class Runner {
}