package com.selenium.Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdownforRedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.com/");

		driver.findElement(By.cssSelector("input[id='src']")).sendKeys("nag");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//section[@id='search']/div/div[1]/div/ul/li[1]")).click();

		driver.findElement(By.cssSelector("input[id='dest']")).sendKeys("mum");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//section[@id='search']/div/div[2]/div/ul/li[3]")).click();

		driver.findElement(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[7]")).click();

		driver.findElement(By.cssSelector("button[id='search_btn']")).click();
	}

}

/*
 * From Input Box.
 * 
 * input[id='src']
 * 
 * To Input Box.
 * 
 * input[id='dest']
 * 
 * 
 * Suggestive Dropdown: (xpath)
 * 
 * Input 1
 * //section[@id="search"]/div/div[1]/div/ul/li[1] 
 * 
 * input 2
 * //section[@id="search"]/div/div[2]/div/ul/li[3]
 * 
 * 
 * Calander:- (Xpath)
 * 
 * //div[@id="rb-calendar_onward_cal"]/table/tbody/tr[3]/td[7]
 * 
 * 
 * 
 * Search button css selector :-------button[id='search_btn']
 */