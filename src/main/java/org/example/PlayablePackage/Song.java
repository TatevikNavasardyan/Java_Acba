package org.example.PlayablePackage;

public class Song implements Playable {
    private String title;
    private String artist;

    public Song(String title,String artist ){
        this.artist=artist;
        this.title=title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public void play() {
        System.out.println("Playing song: " + getTitle()+" by "+getArtist()) ;

    }
}
