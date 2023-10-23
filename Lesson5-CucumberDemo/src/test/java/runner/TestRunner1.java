package runner;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\test\\java\\features\\TagsDemo.feature",
				glue= {"steps"},
				dryRun=false,
				plugin= {"pretty","html:target/cucumberreport.html"},
				tags="@all"
			
		)


public class TestRunner1 {

	
	
	
}
