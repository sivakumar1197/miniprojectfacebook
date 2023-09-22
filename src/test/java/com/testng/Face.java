package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageObjectManager.ManageObjectFacebook;
import com.ReaderManager.ReaderManager;

import Baseclass.Base;

public class Face extends Base {
	public static WebDriver driver;
	public static ManageObjectFacebook face = new ManageObjectFacebook(driver);

	@Test(priority = 1)
	public void launch() {

		LaunchBrowser("chrome");

	}

	@Test(priority = 2)
	public void urllaunch() throws Exception {
		String url = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getUrl();
		getURL(url);
		String day = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getDay();
		Dropdown(face.Instant_Createaccountpage().getBirthday(), day);
	}
}
