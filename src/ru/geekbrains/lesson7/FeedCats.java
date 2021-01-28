package ru.geekbrains.lesson7;

public class FeedCats {
    public static void main(String[] args) {

        Plate plate1 = new Plate(30);

        Cat [] catsArray = new Cat[5];
        catsArray [0] = new Cat("Cat1", 15);
        catsArray [1] = new Cat("Cat2", 20);
        catsArray [2] = new Cat("Cat3",10);
        catsArray [3] = new Cat("Cat4", 25);
        catsArray [4] = new Cat("Cat5",15);

        feedAllCats(plate1, catsArray);
        checkResultOfFeed(catsArray);
        addTheFoodToThePlate(plate1);
    }

    private static void addTheFoodToThePlate(Plate plate1) {
        plate1.addFood(60);
        plate1.info();
    }

    private static void checkResultOfFeed(Cat[] catsArray) {
        for (Cat cat : catsArray) {
            System.out.println(cat);
        }
    }

    private static void feedAllCats(Plate plate1, Cat[] catsArray) {
        for (Cat cat : catsArray) {
            cat.eat(plate1);
        }
    }
}
