package com.eclipse.sauceDemoProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		super();

		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 5);
	}

	@FindBy(id = "user-name")
	private WebElement userNameFieldWebElement;

	@FindBy(name = "password")
	private WebElement passwordFieldWebElement;

	@FindBy(xpath = "//input[@name='login-button']")
	private WebElement submitButton;

	private void enterUserName(String UserName) {
		wait.until(ExpectedConditions.visibilityOf(userNameFieldWebElement));
		this.userNameFieldWebElement.sendKeys(UserName);
	}

	private void enterPassWord(String pwd) {
		wait.until(ExpectedConditions.visibilityOf(passwordFieldWebElement));
		this.passwordFieldWebElement.sendKeys(pwd);
	}
	
	private void clickSubmit()
	{
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
	}
	
	public void loginToMainPage(String userName, String password)
	{
		enterUserName(userName);
		enterPassWord(password);
		clickSubmit();
	}

}
