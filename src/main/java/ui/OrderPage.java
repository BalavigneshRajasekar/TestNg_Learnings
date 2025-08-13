package ui;

import org.testng.annotations.Test;

public class OrderPage {
	@Test(groups = { "sanity" }, priority = 1)
	public void currentOrder() {
		System.out.println("current order page");

	}

	@Test(groups = { "sanity" }, priority = 2)
	public void pastOrder() {
		System.out.println("past orders");
	}

	@Test(groups = "sanity", priority = 3)
	public void returnOrder() {
		System.out.println("return orders");
	}

}
