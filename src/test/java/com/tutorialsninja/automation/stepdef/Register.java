package com.tutorialsninja.automation.stepdef;


import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.accountSucessInfo;
import com.tutorialsninja.automation.pages.headersSection;
import com.tutorialsninja.automation.pages.registerPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;



public class Register {
	
	headersSection hs=new headersSection();
	registerPage rp=new registerPage();
	accountSucessInfo asi= new accountSucessInfo();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		Base.driver.get(Base.reader.getUrl()); //Base Class>driver obj>.get>.Base.reader>.geturl.
	   
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
		Elements.click(headersSection.myAccountLink);
		Elements.click(headersSection.register);
	   
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)  {
//		
//		Map<String,String> map = dataTable.asMap(String.class,String.class);  //datatable>thereincucu>convertasmap>
//		Elements.TypeText(registerPage.firstName,map.get("FirstName"));  //Eleclaass>Typetext>registerpagecallss>firstname PFWEBELEMET>map.getFirstname will get value from Registercucu
//		Elements.TypeText(registerPage.lastName,map.get("LastName"));
//		Elements.TypeText(registerPage.email,map.get("Email"));
//		Elements.TypeText(registerPage.telephone,map.get("Telephone"));
//		Elements.TypeText(registerPage.password,map.get("Password"));
//		Elements.TypeText(registerPage.confirmPassword,map.get("Password"));
	    
		registerPage.enterAllDetails(dataTable);
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy()  {
		
		Elements.click(registerPage.privacyPolicy);
	   
	}

	@And("^I click on Continue button$")
	public void i_click_on_Continue_button()  {
		
		Elements.click(registerPage.continueButton);
	   
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(accountSucessInfo.accountSucessinformation));
	}
	
	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created() {
		Assert.assertTrue(Elements.isDisplayed(registerPage.landingonfail));
		System.out.println("i am pass");
	}

	@Then("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields()  {
		Assert.assertTrue(Elements.isDisplayed(registerPage.firstnamewarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.lastnamewarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.emailwarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.telephonewarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.passwordwarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.checkboxPopupwarning));
	   
	}

	@And("^I subscribe to NewsLetter$")
	public void i_subscribe_to_NewsLetter()  {
	    
		Elements.click(registerPage.subscribenewsletter);
	}

}
