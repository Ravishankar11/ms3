package pageObjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusableComponents.base;
import uiStores.TestCaseOne;
import uiStores.TestCaseTwo;

public class TestCaseTwoTesting extends base {
	
	public static Logger log = Logger.getLogger(base.class.getName());
	
	@BeforeTest
	public void browserOpen() throws IOException
	{
		driver=initiateDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void findResort() throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
		log.info("Entered onto url");
		
		TestCaseOne t1=new TestCaseOne(driver);
		TestCaseTwo t2=new TestCaseTwo(driver);
		//t1.getPopup().click();
		Thread.sleep(900);
		t2.getResortSection().click();
		log.info("Clicked on Resort Section");
		Thread.sleep(900);
		Assert.assertTrue(t2.getResortText().getText().contains("Discover the magic of Novotel Resorts!"));
		log.info("Text verified");
		log.info("TestCase2 Passed");
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
