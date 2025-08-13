package ui;

import org.testng.annotations.Test;

public class AccountPage {

	@Test(groups = "regression", priority = 1)
	public void editAccount() {
		System.out.println("account edited");

	}

	@Test(groups = "regression", priority = 2)
	public void addAddress() {
		System.out.println("address added");
	}

	@Test(groups = "sanity", priority = 3)
	public void removeFavourite() {
		System.out.println("favourite removed");
	}

}
