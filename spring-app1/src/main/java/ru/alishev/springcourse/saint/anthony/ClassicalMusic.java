package ru.alishev.springcourse.saint.anthony;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("My initialization");
    }

    public void doMyDestroy() {
        System.out.println("My destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
