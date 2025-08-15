package ui;

import org.testng.annotations.Test;

public class DataProviders {
	@Test(dataProvider = "login", dataProviderClass = CentralizedData.class)
	public void Test1(String name, String pass) {
		System.out.println(name + " " + pass);
	}

	@Test(dataProvider = "login", dataProviderClass = CentralizedData.class)
	public void Test2(String name, String pass, String email) {
		System.out.println(name + " " + pass + " " + email);
	}

}