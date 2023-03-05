package org.pj;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassThree extends BaseClass {

	public ClassThree() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text() = 'Products'])[3]")
	private WebElement product;
	
	
	@FindBy(xpath = "(//a[text() = 'Car Diffusers'])[3]")
	private WebElement cardiff;


	public WebElement getProduct() {
		return product;
	}


	public WebElement getCardiff() {
		return cardiff;
	}
	
	
}
