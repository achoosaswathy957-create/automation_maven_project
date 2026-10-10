package com.orangehrm.test;

import org.testng.annotations.Test;

public class TestNGExample {

	@Test(priority = 1)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority =2, dependsOnMethods = {"login"})
	public void logout() {
		System.out.println("logout");
	}
	@Test(enabled = false)
	public void forgotPassword() {
		System.out.println("Forgot Password");
	}

}
