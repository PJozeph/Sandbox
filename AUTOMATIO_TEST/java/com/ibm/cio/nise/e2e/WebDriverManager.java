package com.ibm.cio.nise.e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

	private WebDriver driver;

	public WebDriverManager() {
		this.driver = new FirefoxDriver();
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = createDriver();
		}
		return driver;
	}

	private WebDriver createDriver() {
		return new FirefoxDriver();
	}

}
