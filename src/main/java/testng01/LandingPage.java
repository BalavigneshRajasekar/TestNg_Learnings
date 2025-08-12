package testng01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println("page launched");

	}

	@Test
	public void homePage() {
		String expected = "First Name";
		String actual = driver.findElement(By.id("firstName")).getAttribute("placeholder");
		Assert.assertEquals(actual, expected);

	}
}
