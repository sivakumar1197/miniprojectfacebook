package com.morningnineam;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TEst {
	@Test(priority = 1)
	public void launch() {
		System.out.println("launch");
	}

	@Test(priority = 2, groups = "smoke")
	public void url() {
		System.out.println("url");
	}

	@Test(priority = 3, groups = "smoke")
	public void login() {
		System.out.println("login");
	}

	@Test(priority = 4, groups = "smoke" , retryAnalyzer = Iretry.class)
	public void addtocart() {
		System.out.println("addtocart");
		throw new RuntimeException();

	}

	@Test(priority = 5, dependsOnGroups = "smoke")
	public void payment() {
		System.out.println("payment");
	}

	@Test(priority = 6, dependsOnMethods = "payment")
	public void delivery() {
		System.out.println("delivery");
	}

}
