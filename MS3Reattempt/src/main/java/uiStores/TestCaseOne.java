package uiStores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponents.base;

public class TestCaseOne extends base
{
	public WebDriver driver;
	
	public TestCaseOne(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By destination=By.id("search-destination");
	By title=By.xpath("//*[@id=\"intersect-6\"]/div/div[1]/div[1]/header/h2/a");
	By popup=By.xpath("//*[@id='onetrust-close-btn-container']/button");
	By searchbutton = By.xpath("//button[@data-initial-text='SEARCH']");
	
	
	public WebElement getDestination()
	{
		return driver.findElement(destination);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
	public WebElement getSearchbutton()
	{
		return driver.findElement(searchbutton);
	}
}