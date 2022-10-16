package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utils.BaseClass;
import org.utils.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("User should launch the chrome and load the url and maximize the window")
	public void user_should_launch_the_chrome_and_load_the_url_and_maximize_the_window() {
	   
	}

	@When("User should click the Sign in link")
	public void user_should_click_the_Sign_in_link() throws InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		Thread.sleep(2000);
		buttonClick(l.getTxtsign1());
	}
	
	@When("User should input invalid username {string} and invalid password {string} in the textbox")
	public void userShouldInputInvalidUsernameAndInvalidPasswordInTheTextbox(String s1, String s2) {
		PojoClass l = new PojoClass();
		WebElement user = l.getTxtuser();
		user.sendKeys(s1);
		WebElement pass = l.getTxtpass();
		pass.sendKeys(s2);
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() throws InterruptedException {
		String act = driver.getCurrentUrl();
		Assert.assertTrue("validate the valid login", act.contains("hotels"));
		System.out.println("successfully  in valid login");
		Thread.sleep(3000);
		
	}

	@When("User should input valid username and valid password in the textbox")
	public void user_should_input_valid_username_and_valid_password_in_the_textbox() throws IOException, InterruptedException {
		PojoClass l = new PojoClass();
		passValue(l.getTxtuser(),getData(2,2));
		Thread.sleep(2000);
		passValue(l.getTxtpass(),getData(2,3));
		Thread.sleep(2000);
	}

	@When("User should click the sign in button")
	public void user_should_click_the_sign_in_button() throws InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsubmit());
		Thread.sleep(10000);
	}

	@When("User should print the current title of the page")
	public void user_should_print_the_current_title_of_the_page() {
		String act = driver.getCurrentUrl();    
		System.out.println(act);
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() throws InterruptedException {
		String act = driver.getCurrentUrl();
		Assert.assertTrue("validate the valid login", act.contains("hotels"));
		System.out.println("successfully login");
		Thread.sleep(3000);
		
	}

	@When("User should click the forgot password link")
	public void user_should_click_the_forgot_password_link() throws InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtfor());
		Thread.sleep(2000);
	}

	@When("User should enter valid email address")
	public void userShouldEnterValidEmailAddress(io.cucumber.datatable.DataTable d) throws InterruptedException {
		//1D list
		  List<String>  li=  d.asList();
		  String s1 = li.get(1);
			//2D list
			//List<List<String>> li = d.asLists();
			//String s1 = li.get(1).get(1);
		    //PojoClass l = new PojoClass();
		    //WebElement us = l.getTxtemail();
		   // us.sendKeys(s1);
			//1D MAP
			//Map<String, String> mp = d.asMap(String.class, String.class);
			//String s1 = mp.get("apple");
			//PojoClass l = new PojoClass();
			//WebElement us = l.getTxtemail();
			 //  us.sendKeys(s1);
			//List<Map<String, String>> mp = d.asMaps();
			//String s1 = mp.get(0).get("apple");
			PojoClass l = new PojoClass();
			WebElement us = l.getTxtemail();
			us.sendKeys(s1);
	}

	@Then("User should click send request link")
	public void user_should_click_send_request_link() throws InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtser());
		Thread.sleep(5000);
	}

	@Then("User should navigate to Reset password page")
	public void user_should_navigate_to_Reset_password_page() {
		String act = driver.getCurrentUrl();
		Assert.assertTrue("validate the valid login", act.contains("hotels"));
		System.out.println("successfully forgot login");
	}
	

	


}
