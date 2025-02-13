package org.example.Game_stream_buffer;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class Role implements Recordable {
    private int x;
    private int y;
    private ArrayList<Item> inventory;
    public class Stats {
        private int hp;
        private int mp;
        private int atk;
        private int mPow;

        @Override
        public String toString() {
            return hp + "," + mp + "," + atk + "," + mPow;
        }
    }

    @Override
    public void record(String path) {

    }

    public String toString(){
      return "ghh";
    }
}
