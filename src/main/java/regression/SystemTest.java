package regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SystemTest extends SetupConfig {
	@Test
	public void login() {
		System.out.println("logged in");
		driver.get("https://www.ebay.com/");
		Assert.assertEquals(false, true);

	}

}
