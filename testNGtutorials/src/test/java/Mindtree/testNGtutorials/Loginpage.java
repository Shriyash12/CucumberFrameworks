package Mindtree.testNGtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("email");
	By password = By.id("pass");
	By login = By.id("login");

}
