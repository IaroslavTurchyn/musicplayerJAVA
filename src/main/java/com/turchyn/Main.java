package com.turchyn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(
                ProjectConfig.class );
        MusicPlayer musicPlayerR = context.getBean("musicPlayerR", MusicPlayer.class);
        musicPlayerR.playMusic();
    }
}