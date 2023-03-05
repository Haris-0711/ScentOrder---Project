package org.stepdefinition;

import org.bs.BaseClass;
import org.pj.ClassThree;

import cucumber.api.java.en.When;

public class ScenarioThree extends BaseClass {
	
@When("To click the product button")
public void to_click_the_product_button() throws InterruptedException {
  ClassThree c3 = new ClassThree();
  sleep();
  clickBtn(c3.getProduct());
}

@When("To mouse hover the product and clicks the car diffusers")
public void to_mouse_hover_the_product_and_clicks_the_car_diffusers() throws InterruptedException {
	 ClassThree c3 = new ClassThree();
	  sleep();
	  moveCursor(c3.getProduct());
	  sleep();
	  moveCursor(c3.getCardiff());
	  clickBtn(c3.getCardiff());
	  sleep();
	  
	  
}

}
