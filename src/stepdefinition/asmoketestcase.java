//package stepdefinition;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class asmoketestcase 
//{
//	public static WebDriver driver;
//	
//	@Given("^open SFDC URL$")
//	public void open_SFDC_URL() throws Throwable {
//		
//		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32_2.41.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("test-type");
//		options.addArguments("start-maximized");
//		options.addArguments("user-data-dir=D:/temp/");
//		capabilities.setCapability("chrome.binary","Drivers/chromedriver_win32_2.41.exe");
//		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
//		
//		
//		driver = new ChromeDriver(capabilities);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://login.salesforce.com/");
//	}
//
//	//@When("^Entr User ID and Pwd$")
//	@When("^Entr \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void entr_User_ID_and_Pwd(String uname, String pwd) throws Throwable {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("username")).sendKeys(uname);
//		driver.findElement(By.id("password")).sendKeys(pwd);
//
//	}
//
//	@Then("^Login successful$")
//	public void login_successful() throws Throwable {
//		driver.findElement(By.name("Login")).click();
//		Thread.sleep(9000);
//		String title=driver.getTitle();
//		if (title.contains("Salesforce"))
//		{
//			System.out.println("Login Successful" +" "+ title);
//		}
//		else
//		{
//			System.out.println("Login Fail" +" "+ title);
//
//		}
//	}
//	
//	@Then("^Logout$")
//	public void logout() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]")).click();
//		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[4]")).click();
//	    driver.quit();
//
//	}
//
//	
//}
