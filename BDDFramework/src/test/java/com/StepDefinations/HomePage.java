package com.StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BrowserControls.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage extends BaseClass {
	
	//private variables(Locators)
	
	private String searchDropdownBox = "//select[@id='searchDropdownBox']";
	private String searchField = "//input[@id='twotabsearchtextbox']";
	private String seachButton = "//input[@class='nav-input']";
	@Given("I am on amazon homepage")
	public void i_am_on_amazon_homepage() throws InterruptedException {
		browser.get(baseURL);
		Thread.sleep(3000);		
	    
	}

	@Then("I should see {string} title")
	public void i_should_see_title(String expectedTitle) {

		Assert.assertEquals(expectedTitle, browser.getTitle());
	    
	}
	
	@Then("The homepage url should be {string}")
	public void the_homepage_url_should_be(String expectedUrl) {
	   Assert.assertEquals(expectedUrl, browser.getCurrentUrl());
	}
	
	@When("I click on {string} link")
	public void i_click_on_link(String linkText) throws InterruptedException {
	    browser.findElement(By.linkText(linkText)).click();
	    Thread.sleep(3000);
	}
	
	@Then("I should see {int} options available in search dropdown")
	public void i_should_see_options_available_in_search_dropdown(int optionCount) {
		WebElement dropdown = browser.findElement(By.xpath(searchDropdownBox));
		List<WebElement> allOptions = dropdown.findElements(By.tagName("option"));
		Assert.assertEquals(optionCount,allOptions.size());
	}

	@When("I select {string} from search dropdown")
	public void i_select_from_search_dropdown(String string) {
	   browser.findElement(By.xpath(searchDropdownBox)).sendKeys("Clothing");
	   
	}
	
	@Then("I should see {string} option in search dropdown")
	public void i_should_see_option_in_search_dropdown(String searchOption) {
	    WebElement dropdown = browser.findElement(By.xpath(searchDropdownBox));
	    List<WebElement> allOptions = dropdown.findElements(By.tagName("option"));
	    
	    boolean optionPresent = false;
	    
	    for(int i=0;i<allOptions.size(); i++) {
	    System.out.println(allOptions.get(i).getText());
	    if(allOptions.get(i).getText().equals(searchOption)) {
	    	optionPresent = true;
	    	break;
	    	
	    }else {
	    	optionPresent= false;
	    }
	    
	    }
	    Assert.assertTrue(optionPresent);
	    
	}
	
	@When("I seach for {string} in search filed")
	public void i_seach_for_in_search_filed(String searchText)  {
		browser.findElement(By.xpath(searchField)).sendKeys(searchText);
		
	    //Thread.sleep(3000);
	}
	@When("I click on search button")
	public void i_click_on_search_button() throws InterruptedException {
		browser.findElement(By.xpath(seachButton)).click();
		 Thread.sleep(3000);
	}
	
	@Given("I wait for search field to be present")
	public void i_wait_for_search_field_to_be_present() {
		WebDriverWait wait = new WebDriverWait(browser,10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchField)));
		
		
	    
	}
}
