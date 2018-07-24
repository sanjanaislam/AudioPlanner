package com.AP.StepDef;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	private WebDriver driver = null;
	
	@Given("^User visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://82.211.99.100/IDEV_AudioPlanner44/Account/Login");
	}

	@When("^user enter \"User Name\" and \"Password\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("User Name")).sendKeys("UK_12994"); 	 
	    driver.findElement(By.id("Password")).sendKeys("CUE4LIST");
	    driver.findElement(By.id("Login")).click();
	}
	
	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and1(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user successfully log in to the system$")
	public void user_successfully_log_in_to_the_system() throws Throwable {
	   System.out.println( " ^user successfully log in to the system$ ");
	}


}
