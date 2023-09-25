package springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        List<MusicType> list = List.of(MusicType.ROCK, MusicType.CLASSICAL);
        MusicPlayer musicPlayer = context.getBean("player", MusicPlayer.class);
        Computer computer = context.getBean("comp1", Computer.class);
        computer.playPlayer(musicPlayer.playSong(list.get(new Random().nextInt(2))));
        System.out.println("Firm: " + computer.getName());
        System.out.println("Battery: " + computer.getBattery() + "%");
        context.close();
    }
}
