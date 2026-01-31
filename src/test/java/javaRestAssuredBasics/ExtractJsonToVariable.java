package javaRestAssuredBasics;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.hamcrest.Matchers;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.JsonParser.NumberType;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class ExtractJsonToVariable {

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
		 * json-server <filename>.json
		 * 
		 */

//			JsonPath jsonPath = new JsonPath(resultString);

		String resultString = RestAssured
				.given()
				.baseUri("http://localhost:3000")
				.header("Content-Type", "application/json")
//				.accept(ContentType.JSON)
//				.log().all()
				.when()
				.get("/result")
				.then()
//				.log().all()
				.assertThat()
				.statusCode(200)
				.statusLine(Matchers.containsString("OK"))
				.extract()
				.asString()
				;

//		System.out.println(resultString);

			
		String id = RestAssured
				.given()
				.baseUri("http://localhost:3000")
				.header("Content-Type", "application/json")
//				.accept(ContentType.JSON)
//				.log().all()
				.when()
				.get("/result")
				.then()
				.log().body()
				.assertThat()
				.statusCode(200)
				.statusLine(Matchers.containsString("OK"))
				.extract()
				.path("response[0].id");

		System.out.println(id);


	
	
	}

}
