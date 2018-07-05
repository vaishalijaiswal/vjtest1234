package com.Test.group.NewTest;
import Common.DriverUtil;
import Locator.GmailLocator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class GmailLoginSteps 
{
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
//		if(!DriverUtil.driver.getCurrentUrl().equalsIgnoreCase("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession"))
//		{
//			DriverUtil.waitElementDisplayedImplicitlyForSeconds(GmailLocator.username, 30);
//		}	
		
		String s = DriverUtil.driver.getCurrentUrl();
		if(s.contains("https://accounts.google.com/signin"))
				{
				System.out.println("user is on home page");
				}
		else
		{
			DriverUtil.driver.get("https://accounts.google.com");
		}
	}		
		

	
	@When("^user enter username as \"(.*?)\"$")
	public void user_enter_username_as(String arg1) throws Throwable 
	{
		//DriverUtil.driver.findElement(GmailLocator.username);
		DriverUtil.waitElementDisplayedImplicitlyForSeconds(GmailLocator.username, 30);
		DriverUtil.inputtext(GmailLocator.username, arg1);	
	   	
	}

	
	@When("^user enter password as \"(.*?)\"$")
	public void user_enter_password_as(String arg1) throws Throwable 
	{
//		DriverUtil.driver.findElement(GmailLocator.password);
		DriverUtil.waitElementDisplayedImplicitlyForSeconds(GmailLocator.password, 30);
		DriverUtil.inputtext(GmailLocator.password, arg1);	
	
	  }
	
	
	@When("^user click on the first next button$")
	public void user_click_login_button() throws Throwable 
	{
		DriverUtil.waitElementDisplayedImplicitlyForSeconds(GmailLocator.next1, 30);
		DriverUtil.click(GmailLocator.next1);

	}
	@Then("^verify user logged in$")
	public void verify_user_logged_in() throws Throwable 
	{
	
		DriverUtil.waitElementDisplayedImplicitlyForSeconds(GmailLocator.compose,30);

		
	}
	@When("^user click on the second next button$")
	public void user_click_login_second_next_button() throws Throwable 
	{
		DriverUtil.waitElementDisplayedImplicitlyForSeconds(GmailLocator.next2, 30);
		DriverUtil.click(GmailLocator.next2);

	}
	
	@When("^user click on the gmail logo$")
	public void user_click_on_the_gmail_logo() throws Throwable 
	{
		DriverUtil.waitElementDisplayedImplicitlyForSeconds(GmailLocator.gmailLogo, 30);
		DriverUtil.click(GmailLocator.gmailLogo);

	}
	
	}

	