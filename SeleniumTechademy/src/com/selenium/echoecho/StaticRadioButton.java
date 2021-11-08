package com.selenium.echoecho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");

		int count = driver.findElements(By.cssSelector("input[name='group1']")).size();

		for (int i = 0; i < count; i++) {
			driver.findElements(By.cssSelector("input[name='group1']")).get(i).click();
		}

		int count2 = driver.findElements(By.cssSelector("input[name='group2']")).size();

		for (int i = 0; i < count2; i++) {
			String text = driver.findElements(By.cssSelector("input[name='group2']")).get(i).getText();
			
			// To select with specific name:
			if (text.equals("beer")) {
				driver.findElements(By.cssSelector("input[name='group2']")).get(i).click();
			}
		}


		
	}
}
