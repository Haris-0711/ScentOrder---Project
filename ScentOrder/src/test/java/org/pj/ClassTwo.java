package org.pj;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassTwo extends BaseClass {

	public ClassTwo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[text() = 'About Us'])[3]")
	private WebElement about;
	
	@FindBy(xpath = "(//a[text() = 'Download Brochure (ENGLISH)'])[1]")
    private WebElement brochure;

	public WebElement getAbout() {
		return about;
	}

	public WebElement getBrochure() {
		return brochure;
	}
	
	
	
	
}
