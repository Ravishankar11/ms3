package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import reusableComponents.base;

public class Screenshot extends base {
	
	public void getScreenshot(String result) throws IOException
	{
		java.io.File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\eclipse java\\milestone3\\MS3Reattempt\\Screenshots\\"+result+System.currentTimeMillis()+".png"));
	}

}
