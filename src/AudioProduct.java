/**
 * Created by kylel on 10/21/2015.
 */
public class AudioProduct extends Product{

    private int totalSongs;

    public AudioProduct (String productName, int totalSongs) {
        super(productName);
        this.totalSongs = totalSongs;
    }

    public int getTotalSongs() {
        return totalSongs;
    }
}
