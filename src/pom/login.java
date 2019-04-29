package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import util.basepage;

public class login extends basepage
{	
	public static void loginapp() 
	{
		driver.navigate().to("https://login.salesforce.com/");
	}
	
	public static logout uid_pwd(String u, String p)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(u);
		driver.findElement(By.id("password")).sendKeys(p);
		return new logout();
		
	}
	
}
