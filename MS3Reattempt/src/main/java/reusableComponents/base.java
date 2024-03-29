package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver initiateDriver() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("F:\\eclipse java\\milestone3\\MS3Reattempt\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse java\\ComprehensiveAssessment\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
