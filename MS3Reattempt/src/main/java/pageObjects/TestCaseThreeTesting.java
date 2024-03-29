package pageObjects;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import reusableComponents.base;
import uiStores.TestCaseOne;
import uiStores.TestCaseThree;

public class TestCaseThreeTesting extends base{
	
public static Logger log = Logger.getLogger(base.class.getName());
	
	@BeforeTest
	public void browserOpen() throws IOException
	{
		driver=initiateDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void Meeting() throws InterruptedException
	{
		TestCaseOne t1=new TestCaseOne(driver);
		log.info("Entered onto url");
		//t1.getPopup().click();
		Thread.sleep(900);
		TestCaseThree t3=new TestCaseThree(driver);
		
		t3.getExponov().sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		log.info("Clicked on Experience Novotel");
		Set<String> ab = driver.getWindowHandles();
		Iterator<String> it = ab.iterator();
		String parentId = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		t3.getMeeting().click();
		log.info("clicked on meetings");
		String title = driver.getTitle();
		if (title.contains("Meetings and Events")) {
			//System.out.println("Present");
			
			log.info("Title matched");
			log.info("Testcase3 Passed successfully");
		}
		driver.close();
		driver.switchTo().window(parentId);		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
