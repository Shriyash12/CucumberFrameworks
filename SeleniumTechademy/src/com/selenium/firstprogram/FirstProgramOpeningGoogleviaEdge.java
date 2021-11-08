package com.selenium.firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstProgramOpeningGoogleviaEdge {
	public static void main(String[] args) {

		// Invoke .exe file provided by chrome for Selenium.
		System.setProperty("webdriver.edge.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\edge\\msedgedriver.exe");

		// Create Driver object for Chrome Browser.
		// we will strictly implement methods of webdrivers.
		WebDriver driver= new EdgeDriver();
		driver.get("http://google.com");

		// To get the title of the page.
		System.out.println(driver.getTitle());
		
		//Validate if you landed to correct url.
		System.out.println(driver.getCurrentUrl());

	}
}
