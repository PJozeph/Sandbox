package com.ibm.cio.nise.e2e;

import org.openqa.selenium.WebDriver;

import com.ibm.cio.nise.e2e.page.HomePage;
import com.ibm.cio.nise.e2e.page.UploadFilePage;

public class PageObjectManager {
	
	private WebDriver driverManager;
	private HomePage homePage;
	private Validator validator;
	private UploadFilePage uploadFilePage;

	public PageObjectManager(WebDriver driverManager) {
		this.driverManager = driverManager;
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driverManager) :homePage;
	}
	
	public Validator getValidator() {
		return (validator == null) ? validator = new Validator(driverManager) :validator;
	}
	
	public UploadFilePage getUploadFilePage() {
		return (uploadFilePage == null) ? uploadFilePage = new UploadFilePage(driverManager) : uploadFilePage;
	}

}
