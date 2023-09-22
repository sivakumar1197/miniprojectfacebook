package com.PageObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Base;

public class LoginPageRepositary {
	public static WebDriver driver;
	@FindBy(id = "email")
	private WebElement Emailid;

	public LoginPageRepositary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(Base.driver, this);
	}

	public WebElement getEmailid() {
		return Emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getCreatenewaccountbutton() {
		return createnewaccountbutton;
	}

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginbutton;

	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	private WebElement createnewaccountbutton;

}
