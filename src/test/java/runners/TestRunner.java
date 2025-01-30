package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "steps",
        plugin = {
                "pretty",
//                "json:target/reports/cucumber.json",
//                "html:target/reports/cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

public class TestRunner {
}