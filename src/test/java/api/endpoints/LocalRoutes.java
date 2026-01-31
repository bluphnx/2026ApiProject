package api.endpoints;


public class LocalRoutes {
	
/*
  
BaseURI - petstore url -	https://petstore.swagger.io/
POST - create user - https://petstore.swagger.io/v2/user
GET - get user - https://petstore.swagger.io/v2/user/{username}
PUT - update user - https://petstore.swagger.io/v2/user/{username}
PATCH - update user - https://petstore.swagger.io/v2/user/{username}	
DELETE - delete user - https://petstore.swagger.io/v2/user/{username}	
	
*/	

	// Local Server Base url
	public static String base_url = "http://localhost:3000";	
	
	// User Module URLs
	public static String post_url = base_url+"/product";
	public static String get_url = base_url+"/product/{username}";
	public static String getALl_url = base_url+"/product";
	public static String put_url = base_url+"/product/{username}";
	public static String delete_url = base_url+"/product/{username}";
	

}
