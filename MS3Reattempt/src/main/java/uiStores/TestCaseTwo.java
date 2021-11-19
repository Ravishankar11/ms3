package uiStores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponents.base;

public class TestCaseTwo extends base{
	
	public WebDriver driver;
	
	public TestCaseTwo(WebDriver driver)
	{
		this.driver=driver;
	}

	By resortSection=By.xpath("//*[@id=\"pushThematiqueContainer\"]/div/div[3]/div/div[3]/a");
	By text=By.xpath("//*[@id=\"main\"]/section[1]/div[1]/div[1]/p");
	
	public WebElement getResortSection()
	{
		return driver.findElement(resortSection);
	}
	
	public WebElement getResortText()
	{
		return driver.findElement(text);
	}
}
