package ru.geekbrains.lesson5;

public class Person {
    protected String fio;
    protected String position;
    protected String telNumber;
    protected int salary;
    protected int age;


    public Person(String fio, String position, String telNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return   "ФИО: " + fio + "; Должность: " + position +
                "; Тел. номер: " + telNumber + "; Зарплата: " + salary +
                "; Возраст: " + age;
    }
}
