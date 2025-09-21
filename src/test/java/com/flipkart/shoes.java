package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.flipkart.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class shoes extends Utility {


@Given("Launch the application flipkart")
public void launch_the_application_flipkart() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
  
}
@Then("validate the home page flipkart")
public void validate_the_home_page_flipkart() {
    System.out.println("hi");
}

@When("enter shoes in search box")
public void enter_shoes_in_search_box() {
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shoes");
}

@When("click the search")
public void click_the_search() {
	 driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

}
	 

	 
	 
//	 action=new Actions(driver);
//	 WebElement element = driver.findElement(By.xpath("//span[text()='Sports, Books & More']"));
//	 //element.click();
//action.moveToElement(element).perform();



}


