package com.ibm.cio.nise.e2e.page;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilePage {

	private WebDriver driver;

	public UploadFilePage(WebDriver driver) {
		this.driver = driver;
	}

	public void uploadXML(String file) {
		By fileUploadBy = By.className("gwt-FileUpload");
		String fileName = Paths.get(HomePage.RESOURCES_PATH, file).toAbsolutePath().toString();

		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(fileUploadBy));

		driver.findElement(fileUploadBy).sendKeys(fileName);
		driver.findElement(By.id("UploadStartUpload")).click();
	}

}
