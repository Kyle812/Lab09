/**
 * Created by kylel on 10/21/2015.
 */
public class VideoProduct extends Product {

    private VideoType type;

    public VideoProduct (String productname, VideoType type) {
        super(productname);
        this.type = type;
    }

    public VideoType getType() {
        return type;
    }
}
