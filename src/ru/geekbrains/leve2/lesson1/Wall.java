package ru.geekbrains.leve2.lesson1;

public class Wall implements Obstacle {
    @Override
    public boolean pass(Participant p) {
        return p.jump();
    }
}

