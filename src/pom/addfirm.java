package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.basepage;

public class addfirm extends basepage
{

	
	public static void navigatetoaddfirm()
	{
		Actions builder=new Actions(driver);

		WebElement link_firms =driver.findElement(By.xpath("//*[@id=\"01r0H000001IMeq_Tab\"]/a"));
		Actions mouseOverfirms = builder.moveToElement(link_firms);
		mouseOverfirms.click().build().perform();

		WebElement link_new =driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		Actions mouseOversave = builder.moveToElement(link_new);
		mouseOversave.click().build().perform();
		
		WebElement link_continue =driver.findElement(By.xpath("//input[@title='Continue']"));
		Actions mouseOvercontinue = builder.moveToElement(link_continue);
		mouseOvercontinue.click().build().perform();
			
	}
	
	
	public static void newaddfirm()
	{
		driver.findElement(By.id("j_id0:mainpanel:j_id2:j_id7:dt2i:0:j_id11")).sendKeys("SFDC POM FIRM");
		driver.findElement(By.id("j_id0:mainpanel:j_id2:j_id14:j_id15")).sendKeys("SFDC HO OFFICE NM");
		
		driver.findElement(By.id("j_id0:mainpanel:j_id2:j_id14:j_id19")).sendKeys("SFDC 1ST BILLING STREET");
		driver.findElement(By.id("j_id0:mainpanel:j_id2:j_id14:j_id21")).sendKeys("CA");

		driver.findElement(By.id("j_id0:mainpanel:j_id2:j_id14:j_id20")).sendKeys("SFDC BILLING CITY");
		
		driver.findElement(By.id("j_id0:mainpanel:j_id2:j_id14:j_id22")).sendKeys("SFDC ZIP CODE");

		//driver.findElement(By.id("//input[@id='j_id0:mainpanel:j_id2:j_id7:dt2i:9:j_id11']")).sendKeys("Insurance");

		driver.findElement(By.xpath("//*[@id=\"j_id0:mainpanel:j_id2:j_id3:bottom\"]/input[1]")).click();
		
		

		
	}

}
