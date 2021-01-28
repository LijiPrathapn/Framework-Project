package com.learnautomation.pages;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver){

	this.driver = ldriver;
	}
	@FindBy(id="username") WebElement uname;
	@FindBy(id="password") WebElement pass;
	@FindBy(id="Login") WebElement loginButton;
	public void logintoSalesforce(String usernameApplication,String passwordApplication) {

	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	uname.sendKeys(usernameApplication);
	pass.sendKeys(passwordApplication);
	loginButton.click();
	}

}
