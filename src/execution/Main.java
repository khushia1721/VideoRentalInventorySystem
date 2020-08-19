package execution;

import definitons.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("I, Robot", 4);
        // setter method
        // video.setVideoName("Baahubali: The Beginning");
        // video.setRating(5);
        //video.setCheckOut(false);
        System.out.println(
                "Video Name: " + video.getVideoName() + ", " +
                        "Video Rating: " + video.getRating() + ", " +
                        "Is Video Available: " + video.isCheckOut() + ". "
        );

    }
}
