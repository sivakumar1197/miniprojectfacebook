package com.xl;

import org.testng.annotations.Test;

public class Neeeww {
	@Test( retryAnalyzer = Iretry.class)
	public void f() {
		throw new RuntimeException();
	}
}
