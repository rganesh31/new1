package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class BaseTest{


	public static WebDriver driver;


	public void openbrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\chromedriver.exe" );
    	
    	driver = new ChromeDriver();	
		
	}

}
