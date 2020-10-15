package com.training.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditCardInvalidEntryStep {

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
		System.out.println("the application is loaded******");
	}

	@When("^the transaction amout it more than \"([^\"]*)\"$")
	public void the_transaction_amout_it_more_than(int arg1) throws Throwable {
		System.out.println("the transaction amout it more than " + arg1 + "****");
	}

	@Then("^call customer to check if okay$")
	public void call_customer_to_check_if_okay() throws Throwable {
		System.out.println("call customer to check if okay****");
	}

}
