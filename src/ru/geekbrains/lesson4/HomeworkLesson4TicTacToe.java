package ru.geekbrains.lesson4;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson4TicTacToe {

    private static final int SIZE = 3;
    private static final char[][] map = new char[SIZE][SIZE];
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '•';
    private static final int FINAL = 3;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        initializaGame();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkEndGame(DOT_X)){
                break;
            }

            computerTurn();
            printMap();
            if (checkEndGame(DOT_O)){
                break;
            }
        }
    }

    private static boolean checkEndGame(char symbol) {
        if (checkWin(symbol)){
            System.out.println(symbol == DOT_X ? "Человек победил" : "Компьютер победил");
            return true;
        }
        if (isMapFull()){
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static boolean isMapFull(){
        for (char[] row : map) {
            for (char cellValues : row) {
                if (cellValues == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol){

        if (checkDiagonals(symbol) || checkRowsAndCols(symbol)) {
            return true;
        }
        return false;
    }

    private static boolean checkRowsAndCols(char symbol) {
        boolean cols, rows;
        for (int col = 0; col < SIZE; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < SIZE; row++) {
                cols = cols & (map[col][row] == symbol);
                rows = rows & (map[row][col] == symbol);
            }
            if (cols || rows) {
                return true;
            }

        }
        return false;
    }

    private static boolean checkDiagonals(char symbol) {
        int i;
        boolean leftDiagonal = true;
        boolean rightDiagonal = true;
        for (i = 0; i < SIZE; i++){
            leftDiagonal = leftDiagonal & (map[i][i] == symbol);
            rightDiagonal = rightDiagonal & (map[SIZE - i - 1][i] == symbol);
            }
        if (leftDiagonal || rightDiagonal) {
            return true;
        }
        return false;
    }


    private static void computerTurn() {
        int rowIndex;
        int colIndex;
        Random rand = new Random();
        do {
            rowIndex = rand.nextInt(SIZE);

            colIndex = rand.nextInt(SIZE);

        } while (!isCellValid(rowIndex, colIndex));

        map[rowIndex][colIndex] = DOT_O;

    }


    private static void humanTurn() {
        int rowIndex;
        int colIndex;
        do {
            System.out.println("Введите номер строки: ");
            rowIndex = SCANNER.nextInt() - 1;
            System.out.println("Введите номер столбца: ");
            colIndex = SCANNER.nextInt() - 1;
        } while (!isCellValid(rowIndex, colIndex));

        map[rowIndex][colIndex] = DOT_X;
    }

    private static boolean isCellValid(int rowIndex, int colIndex) {
        if (!isArrayIndexValid(rowIndex) || (!isArrayIndexValid(colIndex))){
            System.out.println("Индексы строки, или столбца должны быть в диапазоне от 1 до " + SIZE);
            return false;
        }

        if (map[rowIndex][colIndex] != DOT_EMPTY){
            System.out.println("Данная ячейка уже занята");
            return false;
        }
        return true;
    }

    private static boolean isArrayIndexValid(int index) {

        return index >= 0 && index < SIZE;
    }

    private static void printMap() {
        printHeader();
        printMapState();
        System.out.println();
    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            System.out.print((rowIndex + 1 + " "));
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initializaGame() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                map[rowIndex][colIndex] = DOT_EMPTY;
            }

        }
    }


}
