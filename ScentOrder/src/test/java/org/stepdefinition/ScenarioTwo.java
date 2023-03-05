package org.stepdefinition;

import org.bs.BaseClass;
import org.pj.ClassTwo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioTwo extends BaseClass{
	@When("To click the AboutUs button")
	public void to_click_the_AboutUs_button() throws InterruptedException {
	    ClassTwo c2 = new ClassTwo();
	    sleep();
	    clickBtn(c2.getAbout());
	}

	@When("User scroll down and see the brochure")
	public void user_scroll_down_and_see_the_brochure() throws InterruptedException {
		ClassTwo c2 = new ClassTwo();
	    sleep();
	    scrollPageTop(c2.getBrochure());
	}

	@Then("User click the brochure")
	public void user_click_the_brochure() throws InterruptedException {
		ClassTwo c2 = new ClassTwo();
	    sleep();
	    jsClick(c2.getBrochure());
	}
}
