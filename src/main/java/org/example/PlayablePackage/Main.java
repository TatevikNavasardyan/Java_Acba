package org.example.PlayablePackage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  List <>
        List<Playable> playables = new ArrayList<>();
        playables.add(new Song("Lambada", "DDD"));
        playables.add(new VideoGame("Tank90", "Tankers"));

        for (Playable playable : playables) {
            playable.play();

        }
    }
}
