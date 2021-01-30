package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.headersSection;
import com.tutorialsninja.automation.pages.searchPage;

import cucumber.api.java.en.*;

public class search {
	searchPage sp=new searchPage();
	headersSection hs=new headersSection();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product) {
		
		Elements.TypeText(headersSection.searchArea,product);
		Elements.click(headersSection.clickOnSearchButton);
	}

	@Then("^I should see the product in the search result address$")
	public void i_should_see_the_product_in_the_search_result_address(){
		Assert.assertTrue(Elements.isDisplayed(searchPage.coinfirmAvailablityOfProduct));
		
	   
	}



}
