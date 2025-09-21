package com.base.flipkart;

import org.openqa.selenium.WebElement;

public interface IUtility {
	public void sendtext(WebElement ele,String webelement,int a);
	public void button(WebElement ele);
	public void scrollDown(WebElement ele);
	public void sendtext(WebElement ele,String actions,String b);
	public void sendtext(WebElement ele,String javascript );
	public void scrollup();
	public void mouseHoverToElement();
	public void childWindow();

	public void dragAndDrop();
	public void button(WebElement ele,int i);
	public void button(int i,WebElement ele);
    public void parentWindow();
}
