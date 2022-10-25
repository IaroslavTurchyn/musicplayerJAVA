package com.turchyn;

import java.util.ArrayList;
import java.util.List;

    public class ClassicMusic implements Music {
        private List<Song> classicMusic=new ArrayList<>();

        public ClassicMusic(){
            classicMusic.add(new Song("Classic1","trek1"));
            classicMusic.add(new Song("Classic2","trek2"));
        }


        @Override
        public void playingMusic() {
            for (Song song : classicMusic) {
                System.out.println("play " + song);

            }
        }
    }

