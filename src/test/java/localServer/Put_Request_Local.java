package localServer;

import java.io.File;
import org.hamcrest.Matchers;
import io.restassured.RestAssured;
//import io.restassured.http.ContentType;

public class Put_Request_Local {

	public static void main(String[] args) {
		/*
		 * dependencies rest-assured json-path json gson testng scribejava-apis
		 * json-schema-validator xml-schema-validator
		 * 
		 * 
		 * 
		 * 
		 * json-server
		 * 
		 * npm install -g json-server
		 * 
		 * create a json file in a location (C:\Users\dhejokes\Practice)
		 * 
		 * go to that path and run cmd in command prompt provide
		 * 
		 * json-server
		 * 
		 */

		File file = new File("src\\test\\resources\\features\\jsonFiles\\put_update.json");
		
/*		
		String request = """
				{
				"quantity": 20
				}
				""";

 */
		
		String Id = "006";
		
		RestAssured.given()	
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.pathParam("id", Id) // --> for Deleted,PUT,Patch request
//	    .accept(ContentType.JSON)
		.log().all()
		.when()
		.body(file)
		.put("/products/{id}")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.statusLine(Matchers.containsString("OK"))
		;

	}

}
