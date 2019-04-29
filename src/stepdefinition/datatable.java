//package stepdefinition;
//
//
//import java.io.FileReader;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class datatable
//{
//	@Given("^Input Data table$")
//	public void input_Data_table(DataTable table) throws Throwable {
// 
//		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        List<List<String>> data=table.raw();
//        System.out.println(data.get(0));
//        System.out.println(data.get(0).get(1));
//        System.out.println(data.get(1));
//        System.out.println(data.get(1).get(1));
//
//        
//       //List<String> data1=table.topCells();
//
//		
//	}
//	
//
//	@Then("^Print the data table data$")
//	public void print_the_data_table_data() throws Throwable {
//		System.out.println("Data Table done");
//
//	}
//
//
//	@Then("^Input Data table HashMap Usage$")
//	public void input_Data_table_HashMap_Usage(List<HashMap<String, String>> hmap) throws Throwable {
//	   //System.out.println(arg1);
//		for (Map<String, String> entry : hmap) 
//		{
//            for (String key : entry.keySet()) 
//            {
//                String value = entry.get(key);
//                System.out.println("key = " + key);
//                System.out.println("value = " + value);
//            }
//        }  
//	  	
//	}
//	
//	@Given("^Json Data file parsing$")
//	public void json_Data_file_parsing() throws Throwable {
//        JsonParser parser = new JsonParser();
//        
//       	Object obj = parser.parse(new FileReader("D:\\Workspace\\SFDCCUCUM\\src\\testdata\\first.json"));
//        JsonObject jsonObject = (JsonObject) obj;
//        System.out.println(jsonObject);
//        JsonElement fname=jsonObject.get("firstName");
//        System.out.println(fname);
//        
//        JsonElement lname=jsonObject.get("lastName");
//        System.out.println(lname);
//        
//        //JsonElement num=jsonObject.getAsJsonArray("phoneNumber");
//        
//	}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
