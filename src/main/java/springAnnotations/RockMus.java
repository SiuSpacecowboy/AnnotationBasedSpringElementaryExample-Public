package springAnnotations;

import org.springframework.stereotype.Component;

import java.util.List;

@Component // Если не указывать в ручную id, то по дефолту можно обращаться через название класса с маленькой буквы. Дальше см. MusicPlayer.
public class RockMus implements Music {

    private List<String> songs = List.of("BYOB", "Dal'she", "Angels_With_Dirty_faces");

    @Override
    public List<String> getSong() {
        return songs;
    }
}
