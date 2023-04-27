package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;

public class hooks {
	
	public WebDriver driver;
	
	@io.cucumber.java.Before
	public  void setup(Scenario scenario) {
		System.out.println("before hook");
	}
	
	
	@io.cucumber.java.After
	public void tearDown(Scenario scenario) throws Throwable {
		
			if(scenario.isFailed()) {
	            TakesScreenshot ts = (TakesScreenshot) driver; 
	            byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshotAs,"image/png","screenshott");
	           
	        }
		
		System.out.println(" after hook");
	}
}
