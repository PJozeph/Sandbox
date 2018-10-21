package com.ibm.cio.nise.e2e;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validator {
	
	private static final String ELEMENTS = ".v-slot-grid-upload-details-data .v-horizontallayout .v-slot:nth-of-type(5) > .v-label";
	private static final String X_ICON = ".file-upload-icon img[src$=\"Error.svg\"]";
	private WebDriver driver;

	public Validator(WebDriver driver) {
		this.driver = driver;
	}

	public void findMessageInElement(String message, int inElemenet) {
		waitUntilFindElement();

		List<WebElement> list = getElements();

		Assert.assertTrue(list.get(inElemenet).getText().contains(message));
	}

	public void findXicon() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(X_ICON)));
	}

	private void waitUntilFindElement() {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(ELEMENTS)));
	}
	
	private List<WebElement> getElements() {
		return driver.findElements(By.cssSelector(ELEMENTS));
	}

}
