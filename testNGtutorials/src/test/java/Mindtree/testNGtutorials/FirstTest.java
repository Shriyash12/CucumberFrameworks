package Mindtree.testNGtutorials;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void demo0() {
		System.out.println("Hello Im from demo0");
	}

	@AfterTest
	public void demo1() {
		System.out.println("Hello Im from demo1");
	}

	@Parameters({"URL"})
	@Test
	public void demo3(String shreya) {
		System.out.println(shreya);
	}

	@BeforeTest
	public void demo2() {
		System.out.println("Hello, Im from demo2");
	}
}
