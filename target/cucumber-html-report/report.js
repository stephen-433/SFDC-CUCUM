$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Workspace/SFDCCUCUM/Features/sfdcpom.feature");
formatter.feature({
  "line": 1,
  "name": "Test login SFDC for POM",
  "description": "",
  "id": "test-login-sfdc-for-pom",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with SFDC credentails",
  "description": "",
  "id": "test-login-sfdc-for-pom;login-with-sfdc-credentails",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open SFDC URL with POM",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter POM SFDC \"mars@sfs.com\" and \"M@rs2011\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "SFDC POM Login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "sfdcurllogin.open_SFDC_URL_with_POM()"
});
formatter.result({
  "duration": 11759679080,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mars@sfs.com",
      "offset": 16
    },
    {
      "val": "M@rs2011",
      "offset": 35
    }
  ],
  "location": "sfdcurllogin.enter_POM_SFDC_and(String,String)"
});
formatter.result({
  "duration": 331422573,
  "status": "passed"
});
formatter.match({
  "location": "sfdcurllogin.sfdc_POM_Login_successful()"
});
formatter.result({
  "duration": 16549486638,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add New SFDC Firm",
  "description": "",
  "id": "test-login-sfdc-for-pom;add-new-sfdc-firm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Naviagate to Firm Field and click",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter the Firm Details",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Save the firm",
  "keyword": "Then "
});
formatter.match({
  "location": "sfdcnewfirm.naviagate_to_Firm_Field_and_click()"
});
formatter.result({
  "duration": 7297520255,
  "status": "passed"
});
formatter.match({
  "location": "sfdcnewfirm.enter_the_Firm_Details()"
});
formatter.result({
  "duration": 1816809776,
  "status": "passed"
});
formatter.match({
  "location": "sfdcnewfirm.save_the_firm()"
});
formatter.result({
  "duration": 82431,
  "status": "passed"
});
});