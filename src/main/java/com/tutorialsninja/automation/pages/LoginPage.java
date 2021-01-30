package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	
	public LoginPage()
	{
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(name="email")
	public static WebElement enteremail;

	@FindBy(name="password")
	public static WebElement enterpassword;
	
	@FindBy(css="input[value='Login']")
	public static WebElement clicktologin;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]")
	public static WebElement loginFailedWarningpopup;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]")
	public static WebElement forgotpasswordclick;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]")
	public static WebElement passwordReseted;
	
	
	public static void doLogin(String email,String password)
	{
		Elements.TypeText(LoginPage.enteremail, email);
		Elements.TypeText(LoginPage.enterpassword, password);
		Elements.click(LoginPage.clicktologin);
	}
}
