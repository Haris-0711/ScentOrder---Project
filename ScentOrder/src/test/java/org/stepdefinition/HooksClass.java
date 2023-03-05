package org.stepdefinition;

import org.bs.BaseClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.After;

public class HooksClass extends BaseClass{
	
	
@BeforeClass
public void precondition() {
	  launchBrowser();
	    windowMaximize();
	    launchUrl("https://scentarts.ae/");
	
}

@After
public void postcondition() {
     closingBrowser();
}
}