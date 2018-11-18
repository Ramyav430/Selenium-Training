package com.StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.BrowserControls.BaseClass;

import cucumber.api.java.en.Then;


public class SearchResults extends BaseClass  {
	
	
	//Private variables(Locators)
	
	private String	searchResultsTextField = "//a[@id='bcKwText']";
	
	
	@Then("I should see the search results for {string}")
	public void i_should_see_the_search_results_for(String searchText) {
		
	    String text = browser.findElement(By.xpath(searchResultsTextField)).getText();
		Assert.assertTrue(text.contains(searchText));
	
	
	
	    
	}

}
