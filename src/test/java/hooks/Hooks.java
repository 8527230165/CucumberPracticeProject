package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before
	public void setup(Scenario scenario) {
		System.out.println("Browser opens");
		System.out.println("Execution started for:"+scenario.getName());
	}
	@After
	public void endsession(Scenario scenario) {
		System.out.println("Execution ended for:"+scenario.getName());
		System.out.println("Browser closed");
	}

}
