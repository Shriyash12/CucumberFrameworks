package com.selenium.Webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSpicejet {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://beta.spicejet.com/");
		
		//Work with Static Dropdown, having Select tag.
		
		//Pending due to not having select tag anymore with spice jet.
	}

}
