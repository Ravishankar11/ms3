package uiStores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponents.base;

public class TestCaseThree extends base {

public WebDriver driver;
	
	public TestCaseThree(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By expnovo=By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/ul/li[4]/a");
	By meeting=By.xpath("//*[@id=\"novotelMeeting\"]/div/a");
	
	public WebElement getExponov()
	{
		return driver.findElement(expnovo);
	}
	public WebElement getMeeting()
	{
		return driver.findElement(meeting);
	}

}
