package com.xl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
	@Test
	@Parameters({"emailid","password"})
	public void f(CharSequence emailid, CharSequence password) {

//		ChromeOptions chrome = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(emailid);
		driver.findElement(By.name("pass")).sendKeys(password);

	}
@Ignore
	@DataProvider(name = "input")
	public Object[][] value() {
		Object input[][] = new Object[2][2];

		input[0][0] = "name";
		input[0][1] = "name123";

		input[1][0] = "sad";
		input[1][1] = "sad1234";
		return input;
	}

}
