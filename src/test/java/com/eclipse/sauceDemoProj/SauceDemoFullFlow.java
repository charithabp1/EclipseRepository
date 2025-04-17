package com.eclipse.sauceDemoProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoFullFlow {
	
  @Test
  public void LoginToSauceDemoAndAddObjectsToCart() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.saucedemo.com/");
	  
	  LoginPage page = PageFactory.initElements(driver, LoginPage.class);
	  page.loginToMainPage("standard_user", "secret_sauce");
	  

	  Thread.sleep(Duration.ofSeconds(5));
	  
	 driver.quit();
  }
  
}
