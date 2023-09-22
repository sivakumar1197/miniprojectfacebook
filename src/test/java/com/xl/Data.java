package com.xl;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Data {
	@Test(priority = 1)
	public void zoom() {
		System.out.println("zoom");
	}

	@Test(priority = 2, groups = "hen",expectedExceptions = Exception.class)
	public void moon() {
		System.out.println("moon");
		throw new RuntimeException();
	}

	@Test(priority = 3, groups = "hen")
	public void app() {
		System.out.println("app");
	}

	@Test(priority = 4, dependsOnGroups = "hen")
	public void sun() {
		System.out.println("sun");
	}

}
