package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.login;
import pom.logout;
import util.basepage;

public class sfdcurllogin extends basepage{	
	
	@Given("^open SFDC URL with POM$")
	public void open_SFDC_URL_with_POM() 
	{
		basepage.init();
		login.loginapp();
	}

	@When("^Enter POM SFDC \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_POM_SFDC_and(String unm, String pwd) throws Throwable 
	{
		login.uid_pwd(unm, pwd);
	}
	
	@Then("^SFDC POM Login successful$")
	public void sfdc_POM_Login_successful() 
	{
		logout.sfdclogout();
	}
	
	
	
	
}
