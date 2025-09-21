package com.objectRepository.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.flipkart.Utility;

public class HeadphonesObjectRepository extends Utility{
	
	public HeadphonesObjectRepository() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='Pke_EE']")
	private WebElement searchbox;

	@FindBy(xpath="//button[@class='_2iLD__']")
	private WebElement c;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getc() {
		return c;
	}
}
