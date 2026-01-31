package notes;

import java.util.ArrayList;

import com.github.javafaker.Faker;

import api.payload.Product;
import api.payload.ProductResponse;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faker faker = new Faker();;
		ProductResponse productresponse = new ProductResponse();
		
		// ✅ Initialize the list first!
	    productresponse.setProducts(new ArrayList<>());
		
//		Create a new Product and add it
	    Product product = new Product();
	    
	    
	    product.setId("004");
	    product.setName(faker.name().firstName());
	    product.setQuantity(1);
	    product.setPrice(20);
	    
	    productresponse.getProducts().add(product);
	    
	    System.out.println(productresponse.getProducts().get(0).getId());

	}

}
