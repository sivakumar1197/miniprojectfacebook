package Project.FacebookTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	/// Project.FacebookTest.NewTest

	@Test
	public void f() {
		System.out.println("test case 1");

	}

	@Test
	public void f1() {
		System.out.println("Test case 2");
	}

	@Test
	public void f2() {
		System.out.println("Test case 3");
	}

	@Test
	public void f3() {
		System.out.println("Test case 4");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Login");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Log out");
		System.out.println("screen shot");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("create account");
	}

	@AfterClass
	public void afterClass() {
//		System.out.println("screenshot");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Url launch");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Webpage close");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Launch browser");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Browser close");
	}

}
