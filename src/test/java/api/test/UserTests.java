package api.test;

import java.net.ResponseCache;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.User_Pojo;
import io.restassured.response.Response;

public class UserTests {
	
	
	Faker faker;
	User_Pojo user_pojo;
	
	@BeforeClass
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
		// POST call
		
		Response response = UserEndPoints.CreateUser(user_pojo);
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 201);
	} 
	
	@Test(priority = 2)
	public void TestGetUser() {
		// GET call
		
		Response response = UserEndPoints.ReadUser(this.user_pojo.getUsername());
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
	@Test(priority = 3)
	public void TestPutUser() {
		// PUT call
		
		user_pojo.setFirstName(faker.name().firstName());
		user_pojo.setLastName(faker.name().lastName());
		
		Response response = UserEndPoints.updatrUser(this.user_pojo.getUsername(),user_pojo);
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
	@Test(priority = 4)
	public void TestDeleteUser() {
		// DELETE call
		
	
		Response response = UserEndPoints.deleteUser(this.user_pojo.getUsername());
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 

}
