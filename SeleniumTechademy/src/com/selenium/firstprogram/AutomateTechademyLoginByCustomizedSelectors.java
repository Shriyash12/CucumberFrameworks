package com.selenium.firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateTechademyLoginByCustomizedSelectors {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://techademy.in/mindtreeorchard");
		Thread.sleep(5000l);
		

		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']"))
				.sendKeys("Shriyash@mindtree.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[class*='submit']")).click();
	}

}
/*
 * Website URL:- https://techademy.in/mindtreeorchard/account/landing
 * 
 * Username Xpath:-(By Customized Xpath) //input[@name='userNameOrEmailAddress']
 * 
 * Password css:-(By Customized Css) input[name='password']
 * 
 * Login Xpath:-(By Regular Expression) button[class*='submit']
 */