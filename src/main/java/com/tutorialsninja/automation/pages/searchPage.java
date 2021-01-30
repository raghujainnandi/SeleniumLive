package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class searchPage {
	
	public searchPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Samsung SyncMaster 941BW')]")
	public static WebElement coinfirmAvailablityOfProduct;
	
	
}
