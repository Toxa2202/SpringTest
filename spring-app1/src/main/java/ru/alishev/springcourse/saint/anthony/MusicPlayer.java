package ru.alishev.springcourse.saint.anthony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private DanceMusic danceMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, DanceMusic danceMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.danceMusic = danceMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNum = random.nextInt(3);

        if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNum));
        } else if (musicGenre == MusicGenre.DANCE) {
            System.out.println(danceMusic.getSongs().get(randomNum));
        } else {
            System.out.println(rockMusic.getSongs().get(randomNum));
        }
    }
}
