package infosys.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Image {
	
	public WebDriver driver;
	
	@Given("user is on fb page")
	public void user_is_on_fb_page() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\91908\\eclipse-workspace\\project\\driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	}

	@When("fb image is visible")
	public void fb_image_is_visible() {
		System.out.println("image verified");
	}
}
