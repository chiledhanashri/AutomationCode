package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", // Path to your feature files
		glue = { "StepDefinitions" }, // Package containing step definitions
		plugin = { "pretty", "html:target/cucumber-reports.html" }, // Reporting options
		monochrome = true, // Makes console output readable
		tags = "@Input1" // Optional: Run tests with specific tags
)

public class Runner1 {

}
