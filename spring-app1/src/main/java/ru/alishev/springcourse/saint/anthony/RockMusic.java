package ru.alishev.springcourse.saint.anthony;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("First rockMusic");
        musicList.add("Second rockMusic");
        musicList.add("Third rockMusic");
    }

    @Override
    public List<String> getSongs() {
        return musicList;
    }
}
