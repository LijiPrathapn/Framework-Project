package com.learnautomation.testcases;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;

public class LoginTestSales extends BaseClass {
  WebDriver driver;
@Test
public void loginApp()
{   //Abstraction :showing the  essential features and hiding the background details


driver=BrowserFactory.startApplication(driver,"Chrome","https://login.salesforce.com/");
LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
loginPage.logintoSalesforce("lg123@sp.com", "Pranavam09!");
BrowserFactory.quitBrowser(driver);


}



}


