package api.test;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.LocalEndPoints;
//import api.endpoints.UserEndPoints;
import api.payload.Local_Pojo;
//import api.payload.User_Pojo;
import io.restassured.response.Response;

public class LocalTests {
	
	
	Faker faker;
	Local_Pojo local_pojo;
	
	@BeforeClass
	public void SetupData() {
		
		faker = new Faker();
		local_pojo = new Local_Pojo();
		
		local_pojo.setId(faker.idNumber().hashCode());
		local_pojo.setFirstName(faker.name().firstName());
		local_pojo.setLastName(faker.name().lastName());
		local_pojo.setPhone(faker.phoneNumber().cellPhone());
		local_pojo.setUsername(faker.name().username());
		local_pojo.setEmail(faker.internet().safeEmailAddress());
		local_pojo.setPassword(faker.internet().password(5,10));
				
	}
	
	@Test(priority = 1)
	public void TestPostUser() {
		// POST call
		
		Response response = LocalEndPoints.CreateUser(local_pojo);
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 201);
	} 
	
	@Test(priority = 2)
	public void TestGetUser() {
		// GET call
		
		Response response = LocalEndPoints.ReadUser(this.local_pojo.getUsername());
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
	@Test(priority = 3)
	public void TestPutUser() {
		// PUT call
		
		local_pojo.setFirstName(faker.name().firstName());
		local_pojo.setLastName(faker.name().lastName());
		
		Response response = LocalEndPoints.updateUser(this.local_pojo.getUsername(),local_pojo);
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
	@Test(priority = 4)
	public void TestDeleteUser() {
		// DELETE call
		
	
		Response response = LocalEndPoints.deleteUser(this.local_pojo.getUsername());
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 

}
