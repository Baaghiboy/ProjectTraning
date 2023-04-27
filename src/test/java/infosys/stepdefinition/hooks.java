package infosys.stepdefinition;

import org.junit.After;
import org.junit.Before;

import io.cucumber.java.Scenario;

public class hooks {
	
	@Before
	public  void setup(Scenario s) {
		System.out.println("before hook");
	}
	
	
	@After
	public void tearDown(Scenario s) {
		System.out.println(" after hook");
	}
}
