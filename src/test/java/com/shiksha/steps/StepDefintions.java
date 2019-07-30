package com.shiksha.steps;

import java.util.ArrayList;

import com.shiksha.pages.DocumentationHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintions extends DocumentationHomePage {

	ArrayList<String> links = null;

	@Given("^I am in here Documentation page$")
	public void i_am_in_here_Documentation_page() {
		setDriver();
		navigate("https://developer.here.com/documentation");
	}

	@When("^I click on the documentation Links , it should have loaded properly$")
	public void i_click_on_the_documentation_Links_it_should_have_loaded_properly() throws InterruptedException {
		links = checkDocumentationsLinkRedirection();
	}

	@Then("^the redirected links should be valid$")
	public void the_redirected_links_should_be_valid() {
		validateLinks(links);
		clearAll();

	}

}
