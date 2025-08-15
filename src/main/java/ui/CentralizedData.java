package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class CentralizedData {

	@DataProvider(name = "login")
	public Object[][] loginData(Method m) {

		Object[][] credentials = null;

		if (m.getName().equals("Test1")) {

			credentials = new Object[][] {

					{ "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" },

			};
		}

		else if (m.getName().equals("Test2")) {

			credentials = new Object[][]

			{ { "user4", "pass4", "email4" }, { "user5", "pass5", "email5" }, { "user6", "pass6", "email6" }, };
		}
		;

		return credentials;

	}

}