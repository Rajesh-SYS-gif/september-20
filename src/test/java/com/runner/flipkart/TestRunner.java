package com.runner.flipkart;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Featutes",
                 glue= {"com.flipkart"},
                		
                 monochrome=true,
                 dryRun = false
                 
                 
                 )
public class TestRunner {

}
