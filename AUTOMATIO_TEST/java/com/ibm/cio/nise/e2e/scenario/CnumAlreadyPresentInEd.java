package com.ibm.cio.nise.e2e.scenario;

import com.ibm.cio.nise.e2e.Validator;
import com.ibm.cio.nise.e2e.cucember.TestContext;
import com.ibm.cio.nise.e2e.page.UploadFilePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CnumAlreadyPresentInEd {

	private Validator validator;
	private UploadFilePage uploadFilePage;

	// For PicoContainer
	public CnumAlreadyPresentInEd() {
	}

	public CnumAlreadyPresentInEd(TestContext testContext) {
		this.validator = testContext.getPageObjectManager().getValidator();
		this.uploadFilePage = testContext.getPageObjectManager().getUploadFilePage();
	}

	@When("^I submit xml \"([^\"]*)\"$")
	public void when(String file) {
		uploadFilePage.uploadXML(file);
	}

	@Then("^I see validation message \"([^\"]*)\"$")
	public void then(String errorMessage) {
		validator.findMessageInElement(errorMessage, 0);
	}

}
