package com.ibm.cio.nise.e2e.cucember;

import com.ibm.cio.nise.e2e.PageObjectManager;
import com.ibm.cio.nise.e2e.WebDriverManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		this.webDriverManager = new WebDriverManager();
		this.pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
}
