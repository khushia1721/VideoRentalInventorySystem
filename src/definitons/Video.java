package definitons;

public class Video {

    private String videoName;
    private boolean checkOut;
    private int rating;

    //constructor
    public Video() {
        this.videoName = "Shivaji: The Boss";
        this.rating = 4;
        this.checkOut = true;
    }

    public Video(String videoName, int rating) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = true;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
