package app;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkLesson07 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        int sum = 0;
        int counterForPairedNumbers = 0;
        int counterForUnpairedNumbers = 0;
        int min = 101;
        int max = -101;
        int indexMin = 0;
        int indexMax = 0;
        boolean negativeNumberFound = false;
        float sumAfterFirstNegativeNumbers = 0;
        int countAfterFirstNegativeNumbers = 0;

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(-100, 100);

            if (negativeNumberFound) {
                sumAfterFirstNegativeNumbers += array[i];
                countAfterFirstNegativeNumbers++;
            }

            if (array[i] < 0) {
                sum += array[i];
                if (!negativeNumberFound) {
                    negativeNumberFound = true;
                }
            }

                if (array[i] % 2 == 0) {
                    counterForPairedNumbers++;
                } else {
                    counterForUnpairedNumbers++;
                }

                if (array[i] <= min) {
                    min = array[i];
                    indexMin = i;
                }

                if (array[i] >= max) {
                    max = array[i];
                    indexMax = i;
                }


            }
            float arithmeticMean = sumAfterFirstNegativeNumbers / countAfterFirstNegativeNumbers;
            System.out.println(Arrays.toString(array));
            System.out.println();
            System.out.println("Сума всіх від'ємних чисел в масиві: " + sum);
            System.out.println();
            System.out.println("Кількість парних чисел в масиві: " + counterForPairedNumbers);
            System.out.println();
            System.out.println("Кількість непарних чисел в масиві: " + counterForUnpairedNumbers);
            System.out.println();
            System.out.println("найбільший елемент масиву : " + max + ", його індекс: " + indexMax);
            System.out.println();
            System.out.println("найменший елемент масиву : " + min + ", його індекс: " + indexMin);
            System.out.println();
            System.out.printf("середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві : %.2f", arithmeticMean);



    }

}
