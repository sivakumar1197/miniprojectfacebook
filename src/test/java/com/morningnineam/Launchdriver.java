package com.morningnineam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchdriver {
	public WebDriver driver;

	@Ignore
	@Test
	@Parameters("browser")
	public WebDriver launch(String browser) {
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

	@Test
	@Parameters({ "username", "password" })
	public void data(String username, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);

	}

	@Ignore
	@Test(dataProvider = "input")
	public void f(String username, String password) {

		ChromeOptions chrome = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chrome);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);

	}

	@Ignore
	@DataProvider(name = "input")
	public Object[][] value() {
		Object input[][] = new Object[2][2];

		input[0][0] = "name";
		input[0][1] = "name1234";

		input[1][0] = "pass";
		input[1][1] = "pass1234";

		return input;
	}

}
