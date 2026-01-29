package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import api.payload.User_Pojo;

public class UserEndPoints {
	
	public static Response CreateUser(User_Pojo payload){ 
		
		// POST Method
		// payload ---> request body
		
	Response response = given()
							.accept(ContentType.JSON)
							.contentType(ContentType.JSON)
							.body(payload)
						.when()
							.post(Routes.user_post_url)
						;
	
	return response;
		
	}
	
	public static Response ReadUser(String userName){ 
		
		// GET Method
		// userName ---> is path parameter
		
		Response response = given()
//								.accept(ContentType.JSON) 			// can be provided (optional)
//								.contentType(ContentType.JSON)  	// can be provided (optional)
								.pathParam("username",userName)
							.when()
								.get(Routes.user_get_url)	// username will be appended as {variable} inside the URL
								
//								user_get_url = base_url+"/user/{username}";
							;
		
		return response;
			
		}
	
	public static Response updatrUser(String userName, User_Pojo payload){ 
		
		// PUT Method
		// userName ---> is path parameter
	    // payload ---> request body
		
		Response response = given()
//								.accept(ContentType.JSON) 			// can be provided (optional)
//								.contentType(ContentType.JSON)  	// can be provided (optional)
								.pathParam("username",userName)
								.body(payload)
							.when()
								.put(Routes.user_put_url)	// username will be appended as {variable} inside the URL
								
//								user_put_url = base_url+"/user/{username}";
							;
		
		return response;
			
		}
		
	public static Response deleteUser(String userName){ 
		
		// DELETE Method
		// userName ---> is path parameter
		
		Response response = given()
//								.accept(ContentType.JSON) 			// can be provided (optional)
//								.contentType(ContentType.JSON)  	// can be provided (optional)
								.pathParam("username",userName)
							.when()
								.delete(Routes.user_delete_url)	// username will be appended as {variable} inside the URL
								
//								user_delete_url = base_url+"/user/{username}";
							;
		
		return response;
			
		}

}
