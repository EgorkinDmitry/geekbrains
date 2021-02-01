package ru.geekbrains.leve2.lesson1;

public class Cat implements Participant {
    @Override
    public boolean run() {
        System.out.println("Cat is running");
        return true;
    }

    @Override
    public boolean jump() {
        System.out.println("Cat is jumping");
        return true;
    }
}
