package com.ibm.cio.nise.e2e.page;

import java.io.File;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private static final String USERNAME = System.getProperty("username");
	private static final String PASSWORD = new String(Base64.getDecoder().decode(System.getProperty("password")));
	private static final String APP_UI_URL = System.getProperty("app_ui_url");
	private static final String SEPARATOR = File.separator;
	static final String RESOURCES_PATH = "src" + SEPARATOR + "test" + SEPARATOR + "resources";

	private WebDriver driver;

	public HomePage() {
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToUploadFilePage() {
		driver.get(APP_UI_URL);
		driver.findElement(By.id("loginEmail")).sendKeys(USERNAME);
		driver.findElement(By.id("loginPassword")).sendKeys(PASSWORD);
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.id("loginButton")));
		
		driver.findElement(By.id("loginButton")).click();
	}

	public void logOut() {
		driver.close();
	}

}
