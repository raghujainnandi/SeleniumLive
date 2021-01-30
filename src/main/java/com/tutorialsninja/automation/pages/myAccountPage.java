package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class myAccountPage {
	
	public myAccountPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Register for an affiliate account')]")
	public static WebElement Registeranaffiliateaccount;

}
