package ru.geekbrains.lesson6;

public abstract class Animal {
    protected String name;
    protected int maxDistanceOfRun;
    protected int maxDistanceOfSwim;
    protected double maxDistanceOfJump;


    public Animal(String name, int maxDistanceOfRun, double maxDistanceOfJump) {
        this.name = name;
        this.maxDistanceOfRun = maxDistanceOfRun;
        this.maxDistanceOfJump = maxDistanceOfJump;
    }

    public abstract void run(int distanceOfRun);

    public abstract void swim(int distanceOfSwim);

    public abstract void jump(double distanceOfJump);

}