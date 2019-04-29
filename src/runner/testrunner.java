package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Workspace\\SFDCCUCUM\\Features\\sfdcpom.feature",
		glue={"stepdefinition"},
		plugin={"html:target/cucumber-html-report"},
		format= {"pretty"},
		dryRun=false,
		strict=true,
		monochrome=true,
		tags= {"@smoke,@regress"}
		)


public class testrunner 
{

}
