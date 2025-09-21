package com.flipkart;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.base.flipkart.Utility;
import com.objectRepository.flipkart.HeadphonesObjectRepository;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Headphones extends Utility {
HeadphonesObjectRepository h=new HeadphonesObjectRepository();
		@Given("Launch the application flipkart {string}")
		public void launch_the_application_flipkart(String string) {
		    
	  Utility.browserlaunch(string);
	}
	@Then("validate the home page")
	public void validate_the_home_page() {
	    System.out.println("hi");
	}

	@When("enter headphone in search box")
	public void enter_headphone_in_search_box() {
	//driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("headphone");
		h.getSearchbox().sendKeys("headphones");
    
   
	}
	

@When("click the search button")
public void click_the_search_button() {
	// driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	  h.getc().click();
}


@Then("click the product one")
public void click_the_product_one() {
System.out.println("HI");
}
	

//@Then("move to parent window")
//public void move_to_parent_window() {
//    
//	
//	driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
//	 String parent = driver.getWindowHandle();
//	 Set<String> child = driver.getWindowHandles();
//	 for(String x:child)
//	 {
//		 if(!parent.equals(x))
//			 driver.switchTo().window(x);
//	 }
	 //driver.quit();
//}

@When("user click on sorting {string}")
public void user_click_on_sorting(String string) {
	WebElement element = driver.findElement(By.xpath("//div[text()='"+string+"']"));
	element.click();
}
@Then("user selects the headings with one dim list")
public void user_selects_the_headings_with_one_dim_list(DataTable dataTable) throws InterruptedException {
   List<String> list = dataTable.asList();

   String text = list.get(0);
WebElement element = driver.findElement(By.xpath("//span[text()='"+text+"']"));
wait.until(ExpectedConditions.stalenessOf(element));
action.moveToElement(element).perform();
Thread.sleep(2000);
action.click(element).perform();
}

//
//@Then("user selects the headings with one dim map")
//public void user_selects_the_headings_with_one_dim_map(DataTable dataTable) throws InterruptedException {
//	Map<String, String> Map = dataTable.asMap(String.class,String.class);
//String text = Map.get("value2");
//WebElement element = driver.findElement(By.xpath("//span[text()='"+text+"']"));
//element.click();
//Thread.sleep(2000);
////action.moveToElement(element).perform();
////Thread.sleep(2000);
////action.click(element).perform();
//}
@Then("click the product two")
public void click_the_product_two() {
	 driver.findElement(By.xpath("(//a[@class='wjcEIp'])[2]")).click();
     driver.quit();
}

@Then("click the product three")
public void click_the_product_three() {
    
	driver.findElement(By.xpath("(//a[@class='wjcEIp'])[3]")).click();
driver.quit();	
}

@Then("click the product four")
public void click_the_product_four() {
	driver.findElement(By.xpath("(//a[@class='wjcEIp'])[4]")).click();
driver.quit();
}

@Then("click the product five")
public void click_the_product_five() {
	 driver.findElement(By.xpath("(//a[@class='wjcEIp'])[5]")).click();
     driver.quit();
}
@Then("Quit the browser")
public void quit_the_browser() {
   driver.quit();
   }
}
