package ru.geekbrains.lesson1;

public class HomeworkLesson1 {
    public static void main(String[] args){

        byte byteNumber = 123;
        short shortNumber = 1000;
        int intNumber = 46712;
        long longNumber = 238127864;
        float floatNumber = 3.14F;
        double doubleNumber = 25.3;
        char symbol = 'T';
        boolean answer = true;
        String firstWord = "Мама";


        System.out.println(calculateTheExpression(10, 20, 30, 40));
        System.out.println(checkTheSum(7, 8));
        checkTheNumberPositiveOrNot(-3);
        System.out.println(checkTheNumberIsNegative(-3));
        writeHelloName("Петя");
        checkTheYear(1900);

    }

    public static double calculateTheExpression(float a, float b, float c, float d){
        return (a * (b + (c / d)));
    }

    public static boolean checkTheSum(int a, int b){
        int c = a + b;
        return ((c >= 10) && (c <= 20));
    }

    public static void checkTheNumberPositiveOrNot (int number){
        if (number >=0) {
            System.out.println(number + " Число положительное");
        }
        else {
            System.out.println(number + " Число отрицательное");
        }
    }

    public static boolean checkTheNumberIsNegative (int number){
        return (number < 0);
    }

    public static void writeHelloName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void checkTheYear(int year){
        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }


}
