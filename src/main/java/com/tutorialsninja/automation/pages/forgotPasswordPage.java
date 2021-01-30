package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class forgotPasswordPage {
	
	public forgotPasswordPage() {
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(css="#input-email")
	public static WebElement emailForReset;
	
	@FindBy(css="input[type='submit']")
	public static WebElement clickforreset;

}
