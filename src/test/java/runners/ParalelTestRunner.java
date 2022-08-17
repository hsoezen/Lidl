package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reportsPrl.html",
                "json:target/json-reports/cucumberPrl.json",
                "junit:target/xml-report/cucumberPrl.xml"},
        features = "src/test/resources/UIFeatures",
        glue = "stepdefinitions",
        tags = "@paralel",
        dryRun = false
)

public class ParalelTestRunner {
}
