package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int oneMore;
        int randomNumber;

        do {
            randomNumber = random.nextInt(10);
            guessTheNumber(3, randomNumber, scanner);
            System.out.println("Хотите сыграть ещё раз? (1 - Да, 0 - Нет): ");
            oneMore = scanner.nextInt();
        }
        while (oneMore != 0);
        System.out.println("Спасибо за игру!");

    }
    public static void guessTheNumber(int attempt, int randomNumber, Scanner scanner){

            System.out.println("Угадай число от 0 до 9: ");
            do {
                int number = scanner.nextInt();
                if (number == randomNumber) {
                    attempt = 0;
                    System.out.println("Вы угадали!!!");
                } else {
                    attempt -= 1;
                    if(number > randomNumber) {
                        System.out.println("Ваше число больше, чем загаданное! Осталось попыток: " + attempt);
                    } else System.out.println("Ваше число меньше, чем загаданное! Осталось попыток: " + attempt);
                }
                if ((number != randomNumber) && (attempt == 0)) {
                    System.out.println("Вы проиграли!");
                }
            }
            while (attempt !=0);
    }
}
