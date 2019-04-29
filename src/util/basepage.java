package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public  class basepage {
	
	public static  WebDriver driver;
	public static  Properties prop =new Properties();

	
	public  basepage()  
	{
		File f=new File("D:\\Workspace\\SFDCCUCUM\\src\\testdata\\config.properties");
        FileInputStream fis = null;
			try 
			{
				fis = new FileInputStream(f);
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
		        try 
		        {
					prop.load(fis);
				} 
		        catch (IOException e)
		        {
					e.printStackTrace();
				}
	}
	
	
	public static void init() 
		{
			
			String browsername=prop.getProperty("browser");
			System.out.println(browsername);
			if (browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32_2.41.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("test-type");
				options.addArguments("start-maximized");
				options.addArguments("user-data-dir=D:/temp/");
				capabilities.setCapability("chrome.binary","Drivers/chromedriver_win32_2.41.exe");
				capabilities.setCapability(ChromeOptions.CAPABILITY,options);
				driver = new ChromeDriver(capabilities);
				driver.manage().window().maximize();
				
		}
			
			else
			{
				System.out.println("Write code Valid browser" + browsername );
			}
		
		}
	

}
