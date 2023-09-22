package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Data {
	public static WebDriver driver;

	@Test(retryAnalyzer = Iretry.class)
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("siva");

		driver.findElement(By.name("pass")).sendKeys("siva1234");

		throw new RuntimeException();

//		String actual = driver.getTitle();
//
//		String expect = actual;
//
////		Assert.assertEquals(expect, actual);    ///  hard assert
//
//		SoftAssert soft = new SoftAssert(); /// soft assert
//
//		soft.assertEquals(expect, actual);
//
//		soft.assertAll();

	}

	@Ignore
	@Test
	@Parameters("browser")
	public static WebDriver LaunchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	@Ignore
	@DataProvider(name = "input")
	public Object[][] values() {

		Object input[][] = new Object[2][2];

		input[0][0] = "name";
		input[0][1] = "name1234";

		input[1][0] = "star";
		input[1][1] = "star1234";

		return input;

	}

}
