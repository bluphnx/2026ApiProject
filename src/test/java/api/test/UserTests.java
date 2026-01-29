package api.test;

import java.net.ResponseCache;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.User_Pojo;
import io.restassured.response.Response;

public class UserTests {
	
	
	Faker faker;
	User_Pojo user_pojo;
	
	public void SetupData() {
		
		faker = new Faker();
		user_pojo = new User_Pojo();
		
		user_pojo.setId(faker.idNumber().hashCode());
		user_pojo.setFirstName(faker.name().firstName());
		user_pojo.setLastName(faker.name().lastName());
		user_pojo.setPhone(faker.phoneNumber().cellPhone());
		user_pojo.setUsername(faker.name().username());
		user_pojo.setEmail(faker.internet().safeEmailAddress());
		user_pojo.setPassword(faker.internet().password(5,10));
				
	}
	
	@Test(priority = 1)
	public void TestPostUser() {
		Response response = UserEndPoints.CreateUser(user_pojo);
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 

}
