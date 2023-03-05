package org.stepdefinition;

import org.bs.BaseClass;
import org.pj.ClassOne;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOne extends BaseClass{
	@Given("The user enters the testing site")
	public void the_user_enters_the_testing_site() {
	    launchBrowser();
	    windowMaximize();
	    launchUrl("https://scentarts.ae/");
	    
	}

	@When("To click contact us")
	public void to_click_contact_us() throws InterruptedException {
		
		
	    ClassOne c1 = new ClassOne();
	    sleep();
	    clickBtn(c1.getContact());
	}

	@When("To scroll down and see the address")
	public void to_scroll_down_and_see_the_address() throws InterruptedException {
		
		ClassOne c1 = new ClassOne();
		sleep();
	    scrollPageTop(c1.getAddress());
	}

	@Then("To get the Head Office address")
	public void to_get_the_Head_Office_address() throws InterruptedException {
		
		ClassOne c1 = new ClassOne();
		sleep();
		String ad = c1.getAddress().getText();
		System.out.println(ad);
	}

}
