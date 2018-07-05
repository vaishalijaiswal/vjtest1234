package com.Test.group.NewTest;


	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	//import org.junit.Test;
	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(tags="@login", plugin = { "json", "json:target/cucumber.json" }, features = { "." }, strict = true)
	public class Testrun {

	 @BeforeClass
	 public static void setUp() throws Exception {
		 TestBase.createNewSession();
		
	  
		 
	 }
	  @AfterClass
	   public static void tearDown() throws Exception {
		 System.out.println("tear down");
	     TestBase.driver.quit();
	 
	 }

	}


