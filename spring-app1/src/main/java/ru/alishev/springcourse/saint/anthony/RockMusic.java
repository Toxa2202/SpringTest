package ru.alishev.springcourse.saint.anthony;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    private void doMyInit() {
        System.out.println("rock Initialization");
    }

    private void doMyDestroy() {
        System.out.println("rock Destruction");
    }
}
