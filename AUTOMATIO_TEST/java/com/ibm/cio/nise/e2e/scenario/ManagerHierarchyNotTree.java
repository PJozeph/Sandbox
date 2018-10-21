package com.ibm.cio.nise.e2e.scenario;

import com.ibm.cio.nise.e2e.Validator;
import com.ibm.cio.nise.e2e.cucember.TestContext;
import com.ibm.cio.nise.e2e.page.UploadFilePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManagerHierarchyNotTree {
	
	private UploadFilePage uploadFilePage;
	private Validator validator;
	
	public ManagerHierarchyNotTree() {
	}
	
	public ManagerHierarchyNotTree(TestContext testContext) {
		uploadFilePage = testContext.getPageObjectManager().getUploadFilePage();
		validator = testContext.getPageObjectManager().getValidator();
	}

	@When("^I submit a hierarchy which is not a tree \"([^\"]*)\"$")
	public void when(String file) {
		uploadFilePage.uploadXML(file);
	}

	@Then("^I see hierarchy validation message \"([^\"]*)\"$")
	public void then(String text) {
		validator.findMessageInElement(text,1);
	}
	
}
