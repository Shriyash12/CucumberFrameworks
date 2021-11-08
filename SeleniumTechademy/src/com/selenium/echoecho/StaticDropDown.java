package com.selenium.echoecho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms11.htm");
		Select sel = new Select(driver.findElement(By.cssSelector("select[name='mydropdown']")));
		sel.selectByIndex(2);// This method is used to select the element by Index value
		// sel.selectByValue("Old Cheese");// This method is used to get element by
		// value.

	}

}
