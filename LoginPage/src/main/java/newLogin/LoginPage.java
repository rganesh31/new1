package newLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import utility.Constants;

import base.BaseTest;


public class LoginPage extends BaseTest {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//public LoginPage() throws InterruptedException
		public static void main( String[] args ) throws InterruptedException {
	    
		{
	     	    	
	    	//WebDriver driver;
			driver.get("https://in.yahoo.com/");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//div[@class='text']")).click();
	    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Constants.username);
	     	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	     	Thread.sleep(6000);
	     	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys(Constants.password);
	     	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	     	driver.findElement(By.xpath("//div[@class='icon mail']")).click();
	     	
		}
		
	}

}

