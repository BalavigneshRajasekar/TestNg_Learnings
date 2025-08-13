package ui;

import org.testng.annotations.Test;

public class HomePage {

	@Test(groups = "sanity", priority = 1)
	public void login() {
		System.out.println("Login success");

	}

	@Test(groups = { "sanity", "regression" }, priority = 2)
	public void search() {
		System.out.println("Product searched");
	}

	@Test(groups = { "sanity", "regression" }, priority = 3)
	public void addToCart() {
		System.out.println("Product added to cart");
	}
}
