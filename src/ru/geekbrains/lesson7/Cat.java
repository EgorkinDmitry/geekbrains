package ru.geekbrains.lesson7;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate p){
        if (p.food > appetite) {
            p.decreaseFood(appetite);
            fullness = true;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                "; Сытость: " + fullness;
    }
}
