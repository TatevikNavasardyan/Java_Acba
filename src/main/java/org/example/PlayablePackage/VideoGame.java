package org.example.PlayablePackage;

public class VideoGame implements Playable{
    private String gameTitle;
    private String platform;

    public  VideoGame(String gameTitle, String platform){
        this.gameTitle = gameTitle;
        this.platform = platform;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public String getPlatform() {
        return platform;
    }

    public void play(){
        System.out.println("Launching "+ getGameTitle() + " on " + getPlatform());
    }
}
