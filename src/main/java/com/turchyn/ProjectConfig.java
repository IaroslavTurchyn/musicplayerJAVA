package com.turchyn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.turchyn")
public class ProjectConfig {
    @Bean
    ClassicMusic classicMusic(){return new ClassicMusic();}
    @Bean
    RockMusic rockMusic(){     return new RockMusic();}
    @Bean

    MusicPlayer musicPlayerR(){return  new MusicPlayer( rockMusic());}
    @Bean
    MusicPlayer musicPlayerC(){return new MusicPlayer ( classicMusic());}


}