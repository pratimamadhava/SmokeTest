package BasicScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowser {
	//Cannot create object of an Interface
	//WebDriver driver = new WebDriver();
	
	//Create reference variable for WebDriver
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
		String browser = "Chrome";
		switch(browser)
		{		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pratima.madhava\\Downloads\\drivers\\chromedriver.exe");			
			//ChromeDriver driver = new ChromeDriver();			
			driver = new ChromeDriver();
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pratima.madhava\\Downloads\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();				
			break;
			
		case "Internet Explorer":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pratima.madhava\\Downloads\\drivers\\IEDriverServer.exe");
			driver = new ChromeDriver();
			break;
		}
		driver.manage().window().maximize();
		
		driver.get("http://sigmaaldrich.com");
		//driver.navigate().to("http://webdws.sial.com");
		
		/*driver.get("https://webqws.sial.com/united-states.html");		
		
		//Navigate to previous page
		driver.navigate().back();	
		
		//Navigate to Next page
		driver.navigate().forward();
		
		//Refresh the current page
		driver.navigate().refresh();
		
		//Fetch the current page title
		String getCurrentPageTitle = driver.getTitle();
		System.out.println(getCurrentPageTitle);
		
		//Fetch current page URL
		String getCurrentPageURL = driver.getCurrentUrl();
		System.out.println(getCurrentPageURL);
		
		//Fetch the current page source
		String getCurrentPageSource = driver.getPageSource();
		System.out.println(getCurrentPageSource);*/
		
		
		
		//Enter Textbox
		driver.findElement(By.id("logonId")).sendKeys("pratima_us");
		
		driver.findElement(By.id("logonPassword")).sendKeys("sigma1");
		
		//Click on Login Button		
		driver.findElement(By.xpath("//form[@id='logonForm']//div[@class='input-block']/div[4]/button")).click();		
		
		driver.findElement(By.className("navlink")).click();
		
		driver.findElement(By.linkText("Order Center")).click();
		
		driver.findElement(By.partialLinkText("Order")).click();
				
		//Check if the tetbox is present or not
		boolean isQuickTextBoxPresent = driver.findElement(By.id("Query")).isDisplayed();
		
		driver.findElement(By.id("Query")).sendKeys("Water");
		
		//Clear textbox
		driver.findElement(By.id("Query")).clear();
		
		driver.findElement(By.id("Query")).sendKeys("Benzene");
		
		//Fetch the text from application using locator
		String getSerachTResultText = driver.findElement(By.id("pr-Product Results")).getText();
		
		boolean isena = driver.findElement(By.id("Query")).isEnabled();
		
		boolean issel = driver.findElement(By.id("Query")).isSelected();	
				
		//Close Current window
		driver.close();
		System.out.println("Current browser closed successfully");
		
		//Close the browser instance
		driver.quit();
		System.out.println("Browser instance closed successfully");		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	
	
	
}
	