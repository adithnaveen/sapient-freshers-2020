package com.training.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	@Given("^the web application is loaded$")
	public void the_web_application_is_loaded() throws Throwable {
		System.out.println("the web application is loaded>>>>>");
	}

	@When("^the user logs in with username$")
	public void the_user_logs_in_with_username(DataTable dataTable) throws Throwable {
		System.out.println("the user logs in with username>>>>>>>>>>");

		try {
			for (Map<String, String> temp : dataTable.asMaps(String.class, String.class)) {
				System.out.println(temp.get("username") +" with role " + 
						temp.get("role")
						);
			}

//		 dataTable.asMaps(String.class, String.class).forEach((temp) -> {
//			 
//		 });

		} catch (Exception e) {
		}
	}

	@When("^the \"([a-zA-Z]{1,})\" password$")
	public void the_valid_password(String arg) throws Throwable {
		System.out.println("the " + arg + " password>>>>>>>>>");
	}

	@Then("^the user to be taken to home page$")
	public void the_user_to_be_taken_to_home_page() throws Throwable {
		System.out.println("the user to be taken to home page>>>>>>>>>");
	}

}
