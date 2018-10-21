package com.ibm.cio.nise.e2e.scenario;

import com.ibm.cio.nise.e2e.cucember.TestContext;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class Hooks {

	private TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@After
	public void logout() {
		testContext.getPageObjectManager().getHomePage().logOut();
	}

	@Given("Login")
	public void login() {
		testContext.getPageObjectManager().getHomePage().navigateToUploadFilePage();
	}

}
