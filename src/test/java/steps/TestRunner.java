package steps;
import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/features", glue={"steps"},
monochrome = true,
plugin = { "pretty", 	"html:target/reports/reports.html",
		  				"json:target/reports/cucumber.json",
		  				"junit:target/reports/cucumber.xml"},	
tags="@smoke")

public class TestRunner {
}


