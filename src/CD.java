/**
 * Created by kylel on 10/21/2015.
 */
public class CD extends AudioProduct {

    private double price;

    public CD (String productName, int totalSongs, double price) {
        super(productName, totalSongs);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
