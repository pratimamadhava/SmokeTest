package BasicScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorBasepage extends LaunchBrowser

{
	
	
	public  WebElement LocateById(String idLocator)
	{
		return driver.findElement(By.id(idLocator));
	}
	

}
