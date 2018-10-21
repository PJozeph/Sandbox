package com.ibm.cio.nise.e2e.scenario;

import com.ibm.cio.nise.e2e.Validator;
import com.ibm.cio.nise.e2e.cucember.TestContext;
import com.ibm.cio.nise.e2e.page.UploadFilePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadValidAddXml {

	private Validator validator;
	private UploadFilePage uploadFilePage;

	public UploadValidAddXml(TestContext testContext) {
		this.validator = testContext.getPageObjectManager().getValidator();
		this.uploadFilePage = testContext.getPageObjectManager().getUploadFilePage();
	}
	
	@When("^I submit valid add xml \"([^\"]*)\"$")
	public void when(String file) {
		uploadFilePage.uploadXML(file);
	}

	@Then("^I see sent to ED confirmation \"([^\"]*)\"$")
	public void then(String text) {
		validator.findMessageInElement(text,0);
	}

}
