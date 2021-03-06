package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="B:/Eclipse/Workspace/Frameworks/Cucumber_BDD_Framework/src/main/java/Features/TagsInCucumber.feature",
		glue= {"stepDefinitions"},
		format = {"pretty","html:test-output" , "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun = false,
		monochrome=true,
		tags= { "~@SmokeTest", "@RegressionTest" ,"~@End2EndTest"}
		
		)

public class TestRunner {

}

// OR    : tags= {"@SmokeTest , @RegressionTest"} -- executes all test cases tagged with @SmokeTest and @RegressionTest
// AND   : tags= {"@SmokeTest" , "@End2EndTest"} -- executes test cases tagged witth both SmokeTest and End to End
//Ignore : tags= { "~@SmokeTest", "@RegressionTest" ,"~@End2EndTest"} -- ignores test cases with tags SmokeTest and End2EndTest
