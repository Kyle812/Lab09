/**
 * Created by kylel on 10/21/2015.
 */
public abstract class Product {

    private String productName;
    private double price;

    Product (String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
