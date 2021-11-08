package com.selenium.firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {
	public static void main(String[] args) {
		// get chromedriver.exe
		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		// Create object for the webdriver.
		WebDriver driver = new ChromeDriver();

		// Open url on chrome browser.
		driver.get("http://facebook.com");

		// Inputing data into Username.(using id)
		driver.findElement(By.id("email")).sendKeys("Shriyash Nilawar");

		// Inputting data into password.(using name)
		driver.findElement(By.name("pass")).sendKeys("12345678");

		// Clicking Forget Password?
		driver.findElement(By.name("login")).click();
		
		//Closing the browser
		//driver.close();

	}
}
