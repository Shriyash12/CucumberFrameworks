package com.selenium.Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndigoAirlinesDropdownTestOnAdultsSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.goindigo.in/");
		Thread.sleep(5000);

		WebElement ele = driver
				.findElement(By.xpath("//div[@id='bookFlightTab']/form/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));

		WebElement ele1 = driver
				.findElement(By.xpath("//div[@id='bookFlightTab']/form/div[3]/div[1]/div[2]/div/div/input"));

		// To Clear Default Value.

		ele.clear();
		ele.click();

		// Source Text Box:-
		ele.sendKeys("hyd");
		ele.sendKeys(Keys.ENTER);

		// Destination Text Box:
		ele1.sendKeys("mum");
		ele1.sendKeys(Keys.ENTER);
	}

}
