package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;


public class registerPage {
	
	 public registerPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
		
	@FindBy(id="input-lastname")
	public static WebElement lastName;
		
	@FindBy(id="input-email")
	public static WebElement email;
		
	@FindBy(id="input-telephone")
	public static WebElement telephone;
		
	@FindBy(id="input-password")
	public static WebElement password;
		
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css="input[type='submit']")
	public static WebElement continueButton;
	
	@FindBy(xpath="//body/div[@id='account-register']/ul[1]/li[3]/a[1]")
	public static WebElement landingonfail;
	

	@FindBy(name="firstname")
	public static WebElement firstnamewarning;
	
	@FindBy(name="lastname")
	public static WebElement lastnamewarning;
	
	@FindBy(name="email")
	public static WebElement emailwarning;
	

	@FindBy(name="telephone")
	public static WebElement telephonewarning;
	
	@FindBy(name="password")
	public static WebElement passwordwarning;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement checkboxPopupwarning;
	
	@FindBy(name="newsletter")
	public static WebElement subscribenewsletter;
	
	public static void enterAllDetails(DataTable dataTable)
	{

		Map<String,String> map = dataTable.asMap(String.class,String.class);  //datatable>thereincucu>convertasmap>
		Elements.TypeText(registerPage.firstName,map.get("FirstName"));  //Eleclaass>Typetext>registerpagecallss>firstname PFWEBELEMET>map.getFirstname will get value from Registercucu
		Elements.TypeText(registerPage.lastName,map.get("LastName"));
		Elements.TypeText(registerPage.email,map.get("Email"));
		Elements.TypeText(registerPage.telephone,map.get("Telephone"));
		Elements.TypeText(registerPage.password,map.get("Password"));
		Elements.TypeText(registerPage.confirmPassword,map.get("Password"));
	}

	

}
