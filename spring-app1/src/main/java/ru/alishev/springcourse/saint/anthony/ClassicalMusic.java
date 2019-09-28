package ru.alishev.springcourse.saint.anthony;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("First classicalMusic");
        musicList.add("Second classicalMusic");
        musicList.add("Third classicalMusic");
    }

    @Override
    public List<String> getSongs() {
        return musicList;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("My initialization...");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("My destruction...");
    }
}
