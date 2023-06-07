package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/SystemtestReports/CucumberReport.html",
				"json:target/SystemtestReports/json/report.json",
				"junit:target/SystemtestReports/junit/report.xml"},
		features = "src/test/resources/features",
		glue = {"stepdefinitions","hooks"},
		monochrome = true//,
		//publish = true
		)
public class LoginTest {

}
