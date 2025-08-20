package regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void login() {
		System.out.println("logged in");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "login", alwaysRun = true)
	public void search() {

		System.out.println("Searched");
	}
}
