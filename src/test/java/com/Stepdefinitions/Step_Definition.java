package com.Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;

import com.PageObjectManager.ManageObjectFacebook;
import com.ReaderManager.ReaderManager;
import com.runnerfacebook.Test_runnner;

import Baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base {
	public static WebDriver driver = Test_runnner.driver;

	public static ManageObjectFacebook MOF = new ManageObjectFacebook(driver);

	@Given("User need to open the application")
	public void user_need_to_open_the_application() throws Exception {
		String url = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getUrl();
		getURL(url);
		Implicitwait(50, TimeUnit.SECONDS);
	}
	@org.junit.Ignore
	@When("user enter the username\\(or)mailid in username\\(or)mailid field")
	public void user_enter_the_username_or_mailid_in_username_or_mailid_field() throws Exception {
		String email = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getEmail();
		Inputvalue(MOF.Instant_login().getEmailid(), email);
	}
	@org.junit.Ignore
	@When("user enter the password in password field")
	public void user_enter_the_password_in_password_field() throws Exception {
		String password = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getPassword();
		Inputvalue(MOF.Instant_login().getPassword(), password);
	}
	@org.junit.Ignore
	@Then("user click the login button")
	public void user_click_the_login_button() {
		clickAction(MOF.Instant_login().getLoginbutton());
	}

	@When("user click the create new  account button")
	public void user_click_the_create_new_account_button() {
		clickAction(MOF.Instant_login().getCreatenewaccountbutton());
	}

	@When("user enter the firstname in firstname field")
	public void user_enter_the_firstname_in_firstname_field() {
		Inputvalue(MOF.Instant_Createaccountpage().getFirstname(), "siva");
	}

	@When("user enter the surname in surname field")
	public void user_enter_the_surname_in_surname_field() {
		Inputvalue(MOF.Instant_Createaccountpage().getLastname(), "siva");
	}

	@When("user enter the Newpassword in Newpassword field")
	public void user_enter_the_newpassword_in_newpassword_field() {
		Inputvalue(MOF.Instant_Createaccountpage().getNewEmailid(), "siva");
	}

	@When("user enter the DateOfBirth in DateOfBirth fields")
	public void user_enter_the_date_of_birth_in_date_of_birth_fields() throws Exception {
		String day = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getDay();
		Dropdown(MOF.Instant_Createaccountpage().getBirthday(), day);
		String month = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getMonth();
		Dropdown(MOF.Instant_Createaccountpage().getBirthmonth(), month);
		String year = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getYear();
		Dropdown(MOF.Instant_Createaccountpage().getBirthyear(), year);

	}

	@When("user select the gender in gender field")
	public void user_select_the_gender_in_gender_field() {
		System.out.println("Gender selected");
	}
@org.junit.Ignore
	@Then("user click the sign up button")
	public void user_click_the_sign_up_button() {
		System.out.println("Signup button clicked");
	}

}
