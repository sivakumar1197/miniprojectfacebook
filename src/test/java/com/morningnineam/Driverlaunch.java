package com.morningnineam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverlaunch {
	public static void main(String[] args) {
		
		
		
		
		ChromeOptions chrome = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chrome);
		
		driver.get("https://www.facebook.com/");
		
		
		
		
	}

}
