package ru.geekbrains.lesson6;

public class Dog extends Animal{

    public Dog(String name, int maxDistanceOfRun, int maxDistanceOfSwim, double maxDistanceOfJump) {
        super(name, maxDistanceOfRun, maxDistanceOfJump);
        this.maxDistanceOfSwim = maxDistanceOfSwim;
    }

    @Override
    public void run(int distanceOfRun) {
        boolean resultOfRun = distanceOfRun <= maxDistanceOfRun;
        System.out.println(name + " Run: " + resultOfRun);
    }

    @Override
    public void swim(int distanceOfSwim) {
        boolean resultOfSwim = distanceOfSwim <= maxDistanceOfSwim;
        System.out.println(name + " Swim: " + resultOfSwim);
    }

    @Override
    public void jump(double distanceOfJump) {
        boolean resultOfJump = distanceOfJump <= maxDistanceOfJump;
        System.out.println(name + " Jump: " + resultOfJump);
    }

}
