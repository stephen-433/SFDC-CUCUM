//package stepdefinition;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class hashmaptest {
//	
//	@Before
//	public void beforetest() 
//	{
//		System.out.println("Before Test");
//	}
//	
//	
//	@After
//	public void aftertest() 
//	{
//		System.out.println("After Test");
//	}
//	
//	@Given("^Data for HashMap$")
//	public void Data_for_HashMap() 
//	{
//		System.out.println("Ener the data with intital Statement");
//		
//	}
//	
//	@Then("^enter the data in hash map$")
//	public void enter_the_data_in_hash_map(DataTable data) 
//	{
//	   // Map<String,String> hmap=data.asMap(String.class, String.class);
//	    for (Map<String,String> hmap : data.asMaps(String.class, String.class) )
//	    {
//	    	System.out.println("Loop the hashmap Data");
//	    	System.out.println(hmap.get("Fruits"));
//	    	System.out.println(hmap.get("Cars"));
//
//	    }
//	}
//	    
//	    @Then("^Hash Map Test Done$")
//		public void Hash_Map_Test_Done() 
//		{
//			System.out.println("Hash Map Tests Done");
//			
//		}
//	    
//	    
//	    
//	    // Second test case.
//	    
//		@Given("^Data for HashMap software$")
//		public void Data_for_HashMap_software() 
//		{
//			System.out.println("Ener the data with intital Second Statement");
//			
//		}
//		
//		@Then("^enter the data in hash map for software$")
//		public void enter_the_data_in_hash_map_for_software(List<HashMap<String, String>> hmapdata) 
//		{
//			for (Map<String, String> entry : hmapdata) 
//			{
//				System.out.println(entry.keySet());
//				System.out.println(entry.values());
//				System.out.println(entry.entrySet());
//				
//				for (String key: entry.keySet()) 
//				{
//					String value=entry.get(key);
//					System.out.println(value);
//					
//				}
//			
//			}
//		  
//		}   
//		    @Then("^Hash Map Test Done with hashmap$")
//			public void Hash_Map_Test_Done_with_hashmap() 
//			{
//				System.out.println(" Hashmap with list logic");
//				
//			}
//	    
//	}
//
//
