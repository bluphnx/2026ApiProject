package api.test;



import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.LocalEndPoints;
//import api.endpoints.UserEndPoints;
//import api.payload.Local_Pojo;
import api.payload.Product;
import api.payload.ProductResponse;
//import api.payload.User_Pojo;
import io.restassured.response.Response;

public class LocalProductTests {
	
	
	Faker faker;
	ProductResponse productresponse;
	
	
	@BeforeClass 
	public void SetupData() {
		
		faker = new Faker();
		productresponse = new ProductResponse();
		
		// ✅ Initialize the list first!
	    productresponse.setProduct(new ArrayList<>());
		
//		Create a new Product and add it
	    Product product = new Product();
	    
	    
	    product.setId("004");
	    product.setName(faker.name().firstName());
	    product.setQuantity(1);
	    product.setPrice(20);

				
	}
	
//	@Test(priority = 1)
	public void TestPostUser() {
		// POST call
		
		Response response = LocalEndPoints.CreateUser(productresponse);
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 201);
	} 
	
//	@Test(priority = 2)
	public void TestGetUser() {
		// GET call
		
		Response response = LocalEndPoints.ReadUser(this.productresponse.getProduct().get(0).getId());
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
	@Test(priority = 2)
	public void TestGetAllUser() {
		// GET call
		
		Response response = LocalEndPoints.ReadAllUser();
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
//	@Test(priority = 3)
	public void TestPutUser() {
		// PUT call
		
		productresponse.getProduct().get(0).setName(faker.name().firstName());
		
		Response response = LocalEndPoints.updateUser(this.productresponse.getProduct().get(0).getId(),productresponse);
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
//	@Test(priority = 4)
	public void TestDeleteUser() {
		// DELETE call
		
	
		Response response = LocalEndPoints.deleteUser(this.productresponse.getProduct().get(0).getId());
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 

	
	
}
