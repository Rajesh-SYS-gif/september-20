package com.hooks.flipkart;

import org.junit.After;
import org.junit.Before;

import com.base.flipkart.Utility;

public class Hooks extends Utility {
@Before
public void browserfunctionalities() {
	browserlaunch("https://www.flipkart.com/");
}
@After
public void teardown()
{
	
}

}
