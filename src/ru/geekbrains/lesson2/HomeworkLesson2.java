package ru.geekbrains.lesson2;
import java.util.Arrays;
public class HomeworkLesson2 {

        public static void main(String[] args) {

            // Задание №1
            int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            changeZeroToOne(arr1);

            // Задание №2
            int [] arr2 = new int[8];
            fillTheArray(arr2);

            // Задание №3
            int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            multiplyArrayValues(arr3);

            // Задание №4
            int [][] arr4 = {
                    {3, 5, 8, 4, 2},
                    {5, 7, 0, 2, 6},
                    {4, 5, 9, 3, 5},
                    {2, 2, 7, 5, 5},
                    {7, 8, 9, 2, 5}
            };
            fillTheDiagonalsWithOnes(arr4);

            // Задание №5
            int [] arr5 = {6, 9, -3, 17, 11, 0, -8, 1, 10, 8, 9, -1};
            findMinMaxValue(arr5);

            // Задание №6
            int [] arr6 = {1, 2, 2, 4, 1};
            System.out.println(checkBalance(arr6));

            // Задание №7
            int [] arr7 = {3, 4, 5, 6};
            moveTheArrayElements (arr7, 2);

        }

        public static void changeZeroToOne(int []arr1){
            int i;
            for (i = 0; i < arr1.length; i++ ){
                if (arr1[i] == 0) {
                    arr1[i] = 1;
                } else {
                    arr1[i] = 0;}
            }
            System.out.println(Arrays.toString(arr1));
        }

        public static void fillTheArray(int []arr1){
            int i;
            int k = 0;
            for (i = 0; i < arr1.length; i++){
                arr1[i] = k;
                k += 3;
            }
            System.out.println(Arrays.toString(arr1));
        }

        public static void multiplyArrayValues(int []arr1) {
            int i;
            for (i = 0; i < arr1.length; i++) {
                if (arr1[i] < 6) {
                    arr1[i] *= 2;
                }
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println();
        }

        public static void fillTheDiagonalsWithOnes(int [][]arr1){
            int i, k;
            for (k = 0; k < arr1.length; k++) {
                for (i = 0; i < arr1.length; i++) {
                    arr1[i][i] = 1;
                    arr1[i][(arr1.length - 1) - i] = 1;
                    System.out.print(arr1[k][i]);
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void findMinMaxValue(int []arr1){
            int i, maxValue = arr1[0], minValue = arr1[0];
            for (i = 1; i < arr1.length; i++){
                if (maxValue < arr1[i]) {
                    maxValue = arr1[i];
                }
                if (minValue > arr1[i]){
                    minValue = arr1[i];
                }
            }
            System.out.println("Max: " + maxValue);
            System.out.println("Min: " + minValue);
            System.out.println();
        }

        public static boolean checkBalance (int []arr1){

         int checkLeft = 0, checkRight = 0;
         int i, k;
         boolean checkResult = false;

         for (i = 0; i < arr1.length; i++){
             checkLeft = checkLeft + arr1[i];
             for (k = i + 1; k < arr1.length; k++){
                 checkRight = checkRight + arr1[k];
             }
             if (checkLeft == checkRight ){
                 checkResult = true;
             }
             checkRight = 0;
         }
         return (checkResult);

        }

        public static void moveTheArrayElements (int []arr1, int n){
            int k, i, x;
            if (n > 0) {
                for (k = 0; k < n; k++) {
                    x = arr1[arr1.length - 1];
                    for (i = arr1.length - 1; i > 0; i--) {
                        arr1[i] = arr1[i - 1];
                    }
                    arr1[0] = x;
                }
            } else {
                for (k = 0; k > n; k--) {
                    x = arr1[0];
                    for (i = 0; i < arr1.length - 1; i++) {
                        arr1[i] = arr1[i + 1];
                    }
                    arr1[arr1.length - 1] = x;
                }
            }
            System.out.println(Arrays.toString(arr1));
        }
    }



