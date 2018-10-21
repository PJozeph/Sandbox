package com.ibm.cio.nise.e2e.scenario;

import com.ibm.cio.nise.e2e.Validator;
import com.ibm.cio.nise.e2e.cucember.TestContext;
import com.ibm.cio.nise.e2e.page.UploadFilePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadFileNotXml {

	private Validator validator;
	private UploadFilePage uploadFilePage;
	
	// For PicoContainer
	public UploadFileNotXml() {
	}

	public UploadFileNotXml(TestContext testContext) {
		this.validator = testContext.getPageObjectManager().getValidator();
		this.uploadFilePage = testContext.getPageObjectManager().getUploadFilePage();
	}

	@When("^I submit file which is not xml \"([^\"]*)\"$")
	public void submitFile(String file) {
		uploadFilePage.uploadXML(file);
	}

	@Then("^I see error message$")
	public void iSeeXicon() {
		validator.findXicon();
	}

}
