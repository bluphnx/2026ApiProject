package api.endpoints;


public class Routes {
	
/*
  
BaseURI - petstore url -	https://petstore.swagger.io/
POST - create user - https://petstore.swagger.io/v2/user
GET - get user - https://petstore.swagger.io/v2/user/{username}
PUT - update user - https://petstore.swagger.io/v2/user/{username}
PATCH - update user - https://petstore.swagger.io/v2/user/{username}	
DELETE - delete user - https://petstore.swagger.io/v2/user/{username}	
	
*/	

	
	// Pet store Base url
	public static String base_url = "https://petstore.swagger.io/v2";	
	
	// User Module URLs
	public static String user_post_url = base_url+"/user";
	public static String user_get_url = base_url+"/user/{username}";
	public static String user_put_url = base_url+"/user/{username}";
	public static String user_delete_url = base_url+"/user/{username}";
	
//	{username} --> it is the username and should be changed in the api request as Path parameter
	
	
	// Store Module URLs
	
	// Pet Module URLs
	
}
