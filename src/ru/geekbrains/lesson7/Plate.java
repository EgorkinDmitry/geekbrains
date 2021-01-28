package ru.geekbrains.lesson7;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood (int n) {
        food -= n;
    }

    public void addFood (int m) {
        food += m;
    }

    public void info() {
        System.out.println("Еды в тарелке " + food);
    }
}
