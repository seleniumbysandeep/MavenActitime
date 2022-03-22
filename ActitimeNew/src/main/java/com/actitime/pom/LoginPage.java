package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement untbx;                //declaration
	
	@FindBy(name="pwd")
	private WebElement pwtbx;	
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
		
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);                      //utilization
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}	
}









