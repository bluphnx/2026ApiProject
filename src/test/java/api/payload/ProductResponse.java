package api.payload;

import java.util.List;

public class ProductResponse {
	
	private List<Product> products;

    // Default Constructor
    public ProductResponse() {
    }

    // Parameterized Constructor
    public ProductResponse(List<Product> products) {
        this.products = products;
    }

    // Getter and Setter
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "products=" + products +
                '}';
    }

}
