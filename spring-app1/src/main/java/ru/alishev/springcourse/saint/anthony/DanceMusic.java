package ru.alishev.springcourse.saint.anthony;

import org.springframework.stereotype.Component;


public class DanceMusic implements Music {
    @Override
    public String getSong() {
        return "Exploration to the space.";
    }
}
