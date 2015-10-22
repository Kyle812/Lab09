/**
 * Created by kylel on 10/21/2015.
 */
public class DVD extends VideoProduct {

    private double price;

    public DVD (String productName, VideoType type, double price) {
        super(productName, type);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
