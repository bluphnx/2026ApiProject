package api.test;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.gson.Gson;

import api.endpoints.LocalEndPoints;
//import api.endpoints.UserEndPoints;
import api.payload.Local_Pojo;
import api.payload.Product;
import api.payload.ProductResponse;
//import api.payload.User_Pojo;
import io.restassured.response.Response;

public class LocalProductTests2 {
	
	// Add instance variables
    ProductResponse productresponse;
    ProductResponse response1;
	
	@BeforeClass 
	public void SetupData() throws FileNotFoundException {
		
        // Read JSON file and deserialize to ProductResponse object
        Gson gson = new Gson();
        FileReader reader = new FileReader("src/test/resources/jsonFiles/product.json");
        productresponse = gson.fromJson(reader, ProductResponse.class);
        
     // Create products
        List<Product> products = new ArrayList<>();

        Product p1 = new Product();
        p1.setId("007");
        p1.setName("Orange");
        p1.setQuantity(3);
        p1.setPrice(25);

        Product p2 = new Product();
        p2.setId("009");
        p2.setName("Grapes");
        p2.setQuantity(2);
        p2.setPrice(60);

        products.add(p1);
        products.add(p2);

        // Create ProductResponse
        response1 = new ProductResponse();
        response1.setProduct(products);

        // Serialize to JSON
        Gson gson1 = new Gson();
        String json = gson1.toJson(response1);
        
        System.out.println(json);
    
	}
	
	@Test(priority = 1)
	public void TestPostUser() {
		// POST call
		
		Response response = LocalEndPoints.CreateUser(response1);
		
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
		
//		productresponse.getProduct().get(0).setName(faker.name().firstName());
		
		Response response = LocalEndPoints.updateUser(this.productresponse.getProduct().get(0).getId(),productresponse);
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 
	
	@Test(priority = 4)
	public void TestDeleteUser() {
		// DELETE call
		
	
		Response response = LocalEndPoints.deleteUser(this.productresponse.getProduct().get(0).getId());
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
	} 

	
	
}
