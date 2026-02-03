package api.payload;

import java.util.List;

public class ProductResponse {
	
	private List<Product> product;

    // Default Constructor
    public ProductResponse() {
    }

    // Parameterized Constructor
    public ProductResponse(List<Product> product) {
        this.product = product;
    }

    // Getter and Setter
    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "product=" + product +
                '}';
    }

}
