package ru.geekbrains.lesson6;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat 1", 200, 1);
        Cat cat2 = new Cat("Cat 2", 150, 2.5);
        Cat cat3 = new Cat("Cat 3", 250, 1.5);
        Cat cat4 = new Cat("Cat 4", 300, 2);

        Dog dog1 = new Dog("Dog 1", 500, 10, 1.0);
        Dog dog2 = new Dog("Dog 2", 400, 6, 2.5);
        Dog dog3 = new Dog("Dog 3", 600, 8, 0.5);
        Dog dog4 = new Dog("Dog 4", 500, 11, 2.0);

        dog1.jump(1);
        dog2.swim(8);
        dog3.run(400);
        dog4.run(700);

        cat1.jump(2);
        cat2.swim(3);
        cat3.run(100);
        cat4.run(500);
    }
}
