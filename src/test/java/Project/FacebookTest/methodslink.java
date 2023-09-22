package Project.FacebookTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Baseclass.Base;

public class methodslink extends Base {
	@Test(priority = 1)
	public void launch() {
//		System.out.println("launch");
		LaunchBrowser("chrome");
	}

	@Test(priority = 2)
	public void url() {
		System.out.println("url");
	}

	@Test(priority = 4)
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 3)
	public void signup() {
		System.out.println("signup");
	}

	@Test(priority = 5, groups = "sanity")
	public void search() {
		System.out.println("search");
	}

	@Test(priority = 6, retryAnalyzer = Iretry.class)
	public void selectaproduct() {
		System.out.println("selectaproduct");

		throw new RuntimeException();

	}

	@Test(priority = 7,  retryAnalyzer = Iretry.class)
	public void Addtocart() {
		System.out.println("addtocart");
	}

	@Test(priority = 8, dependsOnMethods = "Addtocart")
	public void order() {
		System.out.println("order");
	}

	@Test(priority = 9)
	public void payment() {
		System.out.println("payment");
	}

	@Ignore
	@Test(priority = 10)
	public void orderconformation() {
		System.out.println("orderconformation");
	}

}
