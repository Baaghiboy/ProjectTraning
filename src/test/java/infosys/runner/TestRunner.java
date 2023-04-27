package infosys.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src\\test\\java\\infosys\\features",
//                 glue = {"infosys\\stepdefinition"},
//                 dryRun=false,
//                 monochrome = true,
//                 plugin = {"pretty","html:target/CucumberReports/report.html",
//                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//                tags = "@zebra"
//                 
//                 
//		)

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\infosys\\features\\fb_login.feature",
                 glue = {"infosys\\stepdefinition"},
                 dryRun=false,
                 monochrome = true,
                 plugin = {"pretty","html:target/CucumberReports/report.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                 
                
                 
                 
		)
public class TestRunner {

	
	
}
