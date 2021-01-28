package ru.geekbrains.leve2.lesson1;

public class Human implements Participant {

    @Override
    public boolean run() {
        System.out.println("Human is running");
        return true;
    }

    @Override
    public boolean jump() {
        System.out.println("Human is jumping");
        return true;
    }
}
