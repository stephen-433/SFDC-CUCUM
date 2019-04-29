package pom;

import org.openqa.selenium.By;

import util.basepage;

public class logout extends basepage{
	
	public static addfirm sfdclogout() 
	{
		
		
		 driver.findElement(By.name("Login")).click();
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String title=driver.getTitle();
			if (title.contains("Salesforce - Unlimited"))
			{
				System.out.println("Login Successful" +" "+ title);
				
			}
			else
			{
				System.out.println("Login Fail" +" "+ title);

			}
			
			return new addfirm();
	}

}
