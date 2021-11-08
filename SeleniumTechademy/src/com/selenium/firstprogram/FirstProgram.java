package com.selenium.firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
	public static void main(String[] args) {

		// Invoke .exe file provided by chrome for Selenium.
		System.setProperty("webdriver.chrome.driver",
				"D:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		// Create Driver object for Chrome Browser.
		// we will strictly implement methods of webdrivers.
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		// To get the title of the page.	
		System.out.println(driver.getTitle());

		// Validate if you landed to correct url.
		System.out.println(driver.getCurrentUrl());

		// If right Click is disable and we are intrested in getting page source the use
		// below method
		System.out.println(driver.getPageSource());

		// If we want to get back/forward from another url using selenium use below
		// method.
		driver.get("http://facebook.com");
		driver.navigate().back(); // for back
		driver.navigate().forward();// for forward.

		// To close the browser there are 2 methods
		//driver.close();
		// driver.quit();//used to close child windows of the browser.

	}
}
