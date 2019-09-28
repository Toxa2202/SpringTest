package ru.alishev.springcourse.saint.anthony;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DanceMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("First danceMusic");
        musicList.add("Second danceMusic");
        musicList.add("Third danceMusic");
    }

    @Override
    public List<String> getSongs() {
        return musicList;
    }
}
