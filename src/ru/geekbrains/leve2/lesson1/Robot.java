package ru.geekbrains.leve2.lesson1;

public class Robot implements Participant {
    @Override
    public boolean run() {
        System.out.println("Robot is running");
        return true;
    }

    @Override
    public boolean jump() {
        System.out.println("Robot is jumping");
        return true;
    }
}
