package springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("player")
public class MusicPlayer {

    private  Music music1;
    private  Music music2;

    @Autowired // Данная аннотация обозначает ссылку на другой объект (ref в XML), тип подбирает сама, можно ставить на Поля, Конструкторы и Сеттеры.
    public MusicPlayer(
            @Qualifier("classic") Music music1, // Если в @Autowired есть несколько объектов, которые удовлетворяют условиям,
            @Qualifier("rockMus") Music music2) { // тогда Spring не понимает и дает ошибку, @Qualifier(уточнитель) помогает точно указать на id объекта.
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playSong(MusicType musicType) {   // См. дальше Computer().
        String res = null;
        if (musicType == MusicType.CLASSICAL) {
            res = "Now playing: " + "\n" + " Song: " + music1.getSong().get(new Random().nextInt(3));
        } else if (musicType == MusicType.ROCK){
            res = "Now playing: " + "\n" + " Song: " + music2.getSong().get(new Random().nextInt(3));
        }
        return res;
    }
}
