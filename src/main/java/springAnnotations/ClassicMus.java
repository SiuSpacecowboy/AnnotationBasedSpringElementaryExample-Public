package springAnnotations;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classic")  // Объявление bean'а. В скобках можно указать его id. Дальше см. RockMus.
public class ClassicMus implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Nocturnes Op.9 No.2");
        songs.add("Joke");
        songs.add("bumblebee's flight");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
