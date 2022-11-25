package com.ecomm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.base.Base_Class;
  
public class LoginPagePom extends Base_Class
{
	public LoginPagePom (WebDriver getDriver)    //argument constructor(parameter pass) 
	{
	       PageFactory.initElements(driver,this);  //this-constructor we create 
     }
	@FindBy(xpath = "//input[@name='uid']")
	WebElement userId;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@name='btnReset']")
	WebElement resetButton;
	
	@FindBy(xpath = "//input[@text()='here']")
	WebElement getCredentials;
	
	
	
	
	

}
