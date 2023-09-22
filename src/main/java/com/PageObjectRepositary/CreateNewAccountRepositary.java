package com.PageObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Base;

public class CreateNewAccountRepositary {
	public static WebDriver driver;

	@FindBy(name = "firstname")
	private WebElement firstname;

	public CreateNewAccountRepositary(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(Base.driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getNewEmailid() {
		return newEmailid;
	}

	public WebElement getReenterEmailid() {
		return reenterEmailid;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	@FindBy(name = "lastname")
	private WebElement lastname;

	@FindBy(name = "reg_email__")
	private WebElement newEmailid;

	@FindBy(id = "email")
	private WebElement reenterEmailid;

	@FindBy(name = "reg_passwd__")
	private WebElement newpassword;

	@FindBy(name = "birthday_month")
	private WebElement Birthmonth;

	public WebElement getBirthmonth() {
		return Birthmonth;
	}

	@FindBy(name = "birthday_day")
	private WebElement Birthday;

	public WebElement getBirthday() {
		return Birthday;
	}

	public WebElement getBirthyear() {
		return Birthyear;
	}

	@FindBy(name = "birthday_year")
	private WebElement Birthyear;

}
