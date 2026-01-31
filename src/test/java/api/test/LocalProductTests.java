package api.test;



import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.LocalEndPoints;
//import api.endpoints.UserEndPoints;
import api.payload.Local_Pojo;
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
	    productresponse.setProducts(new ArrayList<>());
		
//		Create a new Product and add it
	    Product product = new Product();
	    
	    
	    product.setId("004");
	    product.setName(faker.name().firstName());
	    product.setQuantity(1);
	    product.setPrice(20);
	    
//	    productresponse.getProducts().add(product);
	    
	    
//	 // Step 1: Get the list from response object
//	    List<Product> productList = productresponse.getProducts();
//
//	    // Step 2: Add product to that list
//	    productList.add(product);
	    
//	    System.out.println(productresponse.getProducts());
		
//		productresponse.setProducts().get(0).setId("003");
//		productresponse.getProducts().get(0).setName(faker.name().firstName());
//		productresponse.getProducts().get(0).setQuantity(1);
//		productresponse.getProducts().get(0).setPrice(20);
		
		
//		productresponse.setId(faker.idNumber().hashCode());
//		productresponse.setFirstName(faker.name().firstName());
//		productresponse.setLastName(faker.name().lastName());
//		productresponse.setPhone(faker.phoneNumber().cellPhone());
//		productresponse.setUsername(faker.name().username());
//		productresponse.setEmail(faker.internet().safeEmailAddress());
//		productresponse.setPassword(faker.internet().password(5,10));
				
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
		
		Response response = LocalEndPoints.ReadUser(this.productresponse.getProducts().get(0).getId());
		
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
		
		productresponse.getProducts().get(0).setName(faker.name().firstName());
		
		Response response = LocalEndPoints.updateUser(this.productresponse.getProducts().get(0).getId(),productresponse);
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
//	@Test(priority = 4)
	public void TestDeleteUser() {
		// DELETE call
		
	
		Response response = LocalEndPoints.deleteUser(this.productresponse.getProducts().get(0).getId());
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 

	
	
}
