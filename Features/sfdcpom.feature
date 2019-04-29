Feature: Test login SFDC for POM

@smoke
Scenario: Login with SFDC credentails	
Given open SFDC URL with POM
When Enter POM SFDC "mars@sfs.com" and "M@rs2011"
Then SFDC POM Login successful

@smoke
Scenario: Add New SFDC Firm
Given Naviagate to Firm Field and click
Then Enter the Firm Details
Then Save the firm