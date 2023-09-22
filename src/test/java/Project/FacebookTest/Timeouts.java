package Project.FacebookTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import Baseclass.Base;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class Timeouts extends Base {

	@Test
	public void f() {

		LaunchBrowser("chrome");

		getURL("https://www.facebook.com/");

		String facebooktitle = driver.getTitle();

		String except = facebooktitle;

//		Assert.assertEquals(except,facebooktitle);

		SoftAssert s = new SoftAssert();
		
		s.assertEquals(facebooktitle, except);
		s.assertAll();

	}

}
