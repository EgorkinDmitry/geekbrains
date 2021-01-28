package ru.geekbrains.lesson6;

public class Cat extends Animal {

    public Cat(String name, int maxDistanceOfRun, double maxDistanceOfJump) {
        super(name, maxDistanceOfRun, maxDistanceOfJump);
    }

    @Override
    public void run(int distanceOfRun) {
        boolean resultOfRun = distanceOfRun <= maxDistanceOfRun;
        System.out.println(name + " Run: " + resultOfRun);
    }

    @Override
    public void swim(int distanceOfSwim) {
               System.out.println("Коты не умеют плавать");
    }

    @Override
    public void jump(double distanceOfJump) {
        boolean resultOfJump = distanceOfJump <= maxDistanceOfJump;
        System.out.println(name + " Jump: " + resultOfJump);
    }

}
