package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepDefinitions")		



public class hotelApprunner {

	//Sonar-Scanner.bat

}
