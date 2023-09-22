package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.PageObjectRepositary.CreateNewAccountRepositary;
import com.PageObjectRepositary.LoginPageRepositary;

public class ManageObjectFacebook {
	public static WebDriver driver;

	private LoginPageRepositary lr;
	private CreateNewAccountRepositary cnar;

	public ManageObjectFacebook(WebDriver driver2) {
		this.driver=driver2;
	}

	public LoginPageRepositary Instant_login() {
		if (lr == null) {
			lr = new LoginPageRepositary(driver);
		}
		return lr;
	}

	public CreateNewAccountRepositary Instant_Createaccountpage() {
		if (cnar == null) {
			cnar = new CreateNewAccountRepositary(driver);
		}
		return cnar;
	}
}
