package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.forgotPasswordPage;
import com.tutorialsninja.automation.pages.headersSection;
import com.tutorialsninja.automation.pages.myAccountPage;

import cucumber.api.java.en.*;

public class Login {
	
	headersSection hs=new headersSection();
	LoginPage lp=new LoginPage();
	myAccountPage myacc=new myAccountPage();
	forgotPasswordPage fpp=new forgotPasswordPage();
	
	@Given("^I naviage to Account Login page$")
	public void i_naviage_to_Account_Login_page()  {
		
		Elements.click(headersSection.myAccountLink);
		Elements.click(headersSection.clickonLogin);
	 
	}

	@When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_and_Password(String email, String password) {
		
	   LoginPage.doLogin(email, password);
	}

	@Then("^I should see that the User is able to successfully login$")
	public void i_should_see_that_the_User_is_able_to_successfully_login()  {
		Assert.assertTrue(Elements.isDisplayed(myAccountPage.Registeranaffiliateaccount));
	}
	
	@Then("^I should see that the User is unable to login and get a warning Message$")
	public void i_should_see_that_the_User_is_unable_to_login_and_get_a_warning_Message(){
		Assert.assertTrue(Elements.isDisplayed(LoginPage.loginFailedWarningpopup));
	  }
	
	@When("^I reset the forgotten password for \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for(String email)  {
		
		Elements.click(LoginPage.forgotpasswordclick);
		 Elements.TypeText(forgotPasswordPage.emailForReset,email);
		 Elements.click(forgotPasswordPage.clickforreset);
	   
	}

	@Then("^I should see a message informing that the password reset details have been sent to the email address$")
	public void i_should_see_a_message_informing_that_the_password_reset_details_have_been_sent_to_the_email_address() {
	  Assert.assertTrue(Elements.isDisplayed(LoginPage.passwordReseted));		
	}
	}
