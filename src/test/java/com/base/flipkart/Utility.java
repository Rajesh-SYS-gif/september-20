package com.base.flipkart;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility implements IUtility {
	public	static	WebDriver driver;
	public static	Actions action;
	public static Wait wait;

	public static void browserlaunch(String string) {
	    
		   WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(string);
		action=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	}

	@Override
	public void sendtext(WebElement ele, String webelement, int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void button(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scrollDown(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendtext(WebElement ele, String actions, String b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendtext(WebElement ele, String javascript) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scrollup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseHoverToElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childWindow() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void dragAndDrop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void button(WebElement ele, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void button(int i, WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parentWindow() {
		// TODO Auto-generated method stub
		
	}
}
