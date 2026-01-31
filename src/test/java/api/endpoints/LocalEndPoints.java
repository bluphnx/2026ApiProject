package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import api.payload.Local_Pojo;
//import api.payload.User_Pojo;
import api.payload.ProductResponse;

public class LocalEndPoints {
	
	public static Response CreateUser(Local_Pojo payload){ 
		
		// POST Method
		// payload ---> request body
		
	Response response = given()
							.accept(ContentType.JSON)
							.contentType(ContentType.JSON)
							.body(payload)
						.when()
							.post(LocalRoutes.post_url)
						;
	
	return response;
		
	}
	
public static Response CreateUser(ProductResponse payload){ 
		
		// POST Method
		// payload ---> request body
		
	Response response = given()
							.accept(ContentType.JSON)
							.contentType(ContentType.JSON)
							.body(payload)
						.when()
							.post(LocalRoutes.post_url)
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
								.log().all()
							.when()
								.get(LocalRoutes.get_url)	// username will be appended as {variable} inside the URL
								
//								user_get_url = base_url+"/user/{username}";
							;
		
		return response;
			
		}
	
public static Response ReadAllUser(){ 
		
		// GET Method
		// userName ---> is path parameter
		
		Response response = given()
//								.accept(ContentType.JSON) 			// can be provided (optional)
//								.contentType(ContentType.JSON)  	// can be provided (optional)
							.when()
								.get(LocalRoutes.getALl_url)	// username will be appended as {variable} inside the URL
								
//								user_get_url = base_url+"/user/{username}";
							;
		
		return response;
			
		}
	
	
	
	public static Response updateUser(String userName, Local_Pojo payload){ 
		
		// PUT Method
		// userName ---> is path parameter
	    // payload ---> request body
		
		Response response = given()
//								.accept(ContentType.JSON) 			// can be provided (optional)
//								.contentType(ContentType.JSON)  	// can be provided (optional)
								.pathParam("username",userName)
								.body(payload)
							.when()
								.put(LocalRoutes.put_url)	// username will be appended as {variable} inside the URL
								
//								user_put_url = base_url+"/user/{username}";
							;
		
		return response;
			
		}
	
public static Response updateUser(String userName, ProductResponse payload){ 
		
		// PUT Method
		// userName ---> is path parameter
	    // payload ---> request body
		
		Response response = given()
//								.accept(ContentType.JSON) 			// can be provided (optional)
//								.contentType(ContentType.JSON)  	// can be provided (optional)
								.pathParam("username",userName)
								.body(payload)
							.when()
								.put(LocalRoutes.put_url)	// username will be appended as {variable} inside the URL
								
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
								.delete(LocalRoutes.delete_url)	// username will be appended as {variable} inside the URL
								
//								user_delete_url = base_url+"/user/{username}";
							;
		
		return response;
			
		}

}
