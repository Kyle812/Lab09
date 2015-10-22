import java.util.UUID;

/**
 * Created by kylel on 10/21/2015.
 */
public class MP4 extends VideoProduct implements Downloadable{


    public MP4 (String productName, VideoType type) {
        super(productName, type);
    }

    public double getPrice() {
        if (getType().equals(VideoType.MOVIE)) {
            return 4.99;
        } else {
            return 19.99;
        }
    }

    public String generateDownloadCode () {
        return UUID.randomUUID().toString();
    }
}
