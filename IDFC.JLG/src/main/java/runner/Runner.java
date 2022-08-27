package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/testResult/basic-cucumber-report"},
 features = "C:\\Users\\Lenovo\\eclipse-workspace\\IDFC.JLG\\src\\main\\java\\Features\\JLG.feature"
 ,glue={"stepDefinition"},tags= {"@AadharAuto"}
 
 )
public class Runner {
	

}
