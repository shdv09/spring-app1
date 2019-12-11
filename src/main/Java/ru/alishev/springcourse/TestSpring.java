package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstPlayer == secondPlayer);
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);

        secondPlayer.setVolume(20);

        firstPlayer.playSong();
        System.out.println(firstPlayer.getName());
        System.out.println(firstPlayer.getVolume());
        context.close();
    }
}
