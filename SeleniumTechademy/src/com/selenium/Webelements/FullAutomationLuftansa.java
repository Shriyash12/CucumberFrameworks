package com.selenium.Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullAutomationLuftansa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.lufthansa.com/in/en/homepage");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// To agree Privacy setting.
		driver.findElement(By.cssSelector("button[id='cm-acceptAll']")).click();
		
		//Close Popup
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();

		// To Login.

//		driver.findElement(By.xpath("//div[@class='input-border-wrapper']//input[@placeholder='Email address']"))
//				.sendKeys("Shri12nil@gmail.com");
//
//		driver.findElement(By.xpath("//div[@class='input-border-wrapper']//input[@placeholder='Password']"))
//				.sendKeys("Qwerty@1234");
//
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement ele = driver
				.findElement(By.xpath("//div[@class='input-border-wrapper']//input[@placeholder='From']"));
		
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		Thread.sleep(2000l);
		ele.clear();
		ele.click();
		ele.sendKeys("Delhi");
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	}
}
