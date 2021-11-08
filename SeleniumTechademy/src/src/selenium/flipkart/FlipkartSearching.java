package src.selenium.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearching {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Techademy Assignments\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("jbl speakers");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys(Keys.ENTER);

		driver.findElement(By.cssSelector(
				"#container > div > div._36fx1h._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div"))
				.click();

	}
}

//