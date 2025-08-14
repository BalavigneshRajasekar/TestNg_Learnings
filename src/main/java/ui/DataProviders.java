package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	@Test(dataProvider = "dataprovider")
	public void Test1(String name, String pass) {
		System.out.println(name + " " + pass);
	}

	@DataProvider
	public Object[][] dataprovider() {

		return new Object[][] { { "username", "password" }, { "username1", "password1" }

		};

	};

}