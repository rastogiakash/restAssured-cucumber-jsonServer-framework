package TestRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:format"},
				 features="src/test/java/features", 
                 glue="src/test/java/stepDefs")

public class TestRunners_JSonPlaceHolder {

}
