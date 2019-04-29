package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pom.addfirm;

public class sfdcnewfirm 
{
	
	@Given("^Naviagate to Firm Field and click$")
	public void naviagate_to_Firm_Field_and_click()  
	{
		
		addfirm.navigatetoaddfirm();
	}

	@Then("^Enter the Firm Details$")
	public void enter_the_Firm_Details()  
	{
		addfirm.newaddfirm();
	
		
	}

	@Then("^Save the firm$")
	public void save_the_firm() {
	 
		System.out.println("SFDC Firm Added Successfully");
	}

}
