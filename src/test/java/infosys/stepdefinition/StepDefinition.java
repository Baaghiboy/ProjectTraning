package infosys.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class StepDefinition {
	
	
	
	// Works Well (adding screenshot to html report and catch fullscreenshot using adapter)
	
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
		
		driver.quit();
	}
	
	@Given("User is on fb page")
	public void user_is_on_fb_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91908\\eclipse-workspace\\project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User can able to enter name and data")
	public void user_can_able_to_enter_name_and_data() {
	    driver.findElement(By.id("email")).sendKeys("janagan");
	    driver.findElement(By.id("pass")).sendKeys("kumar");
	}

	@Then("User logined successfully")
	public void user_logined_successfully() {
	   System.out.println("Login success");
	}
	
	@Given("user is on fb1 page")
	public void user_is_on_fb1_page() {
	   System.out.println("user on fb page");
	}

	@When("User can able to create new account button")
	public void user_can_able_to_create_new_account_button() {
	   System.out.println("User click new button");
	   
	}

	@Then("User navigated to registartion form")
	public void user_navigated_to_registartion_form() {
	    System.out.println("user navigated to registartion page");
	}
	
	@Given("user is on fb2 page")
	public void user_is_on_fb2_page() {
	   System.out.println("f2 page");
	}

	@When("Verfy image is displayed")
	public void verfy_image_is_displayed() {
		System.out.println("done");
	}
}
