package localServer;

import org.hamcrest.Matchers;
import io.restassured.RestAssured;
//import io.restassured.http.ContentType;

public class Get_Request_Local {

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

		RestAssured.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
//	.accept(ContentType.JSON)
		.log().all()
		.when()
		.get("/products")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.statusLine(Matchers.containsString("OK"))
		;

	}

}
