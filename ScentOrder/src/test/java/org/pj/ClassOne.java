package org.pj;

import javax.xml.xpath.XPath;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ClassOne extends BaseClass {

	public ClassOne() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Contact Us'])[3]")
		
		
	private WebElement contact;

	
	@FindBy(xpath = "//p[@class = 'address']")
	private WebElement address;


	public WebElement getContact() {
		return contact;
	}


	public WebElement getAddress() {
		return address;
	}
	
	
	

}
