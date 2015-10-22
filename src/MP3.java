import java.util.UUID;
/**
 * Created by kylel on 10/21/2015.
 */
public class MP3 extends AudioProduct implements Downloadable {

    public MP3 (String productName) {
        super (productName, 1);
    }

    public String generateDownloadCode () {
        return UUID.randomUUID().toString();
    }

    public double getPrice() {
        return .99;
    }
    
}
