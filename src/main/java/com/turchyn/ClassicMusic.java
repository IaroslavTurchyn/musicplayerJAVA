package com.turchyn;

import java.util.ArrayList;
import java.util.List;

    public class ClassicMusic implements Music {
        private List<Song> classicMusic=new ArrayList<>();

        public ClassicMusic(){
            classicMusic.add(new Song("Шопен","Полонез"));
            classicMusic.add(new Song("Моцарт","Чарівна Флейта"));
        }


        @Override
        public void playingMusic() {
            for (Song song : classicMusic) {
                System.out.println("play " + song);

            }
        }
    }

