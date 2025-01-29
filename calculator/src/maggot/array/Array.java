package maggot.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        double[] originalArr = arrayFill(arrayInitLength());
        System.out.print("Массив: ");
        arrOutput(originalArr);

        double[] sortedUpArr = arraySortUp(originalArr);
        System.out.print("Массив возрастающий: ");
        arrOutput(sortedUpArr);

        double[] sortedDownArr = arraySortDown(originalArr);
        System.out.print("Массив убывающий: ");
        arrOutput(sortedDownArr);

        double sum = arrSum(originalArr);
        System.out.println("Сумма элементов массива: " + sum);

        double max = arrMax(sortedDownArr);
        System.out.println("Наибольшее число: " + max);

        double min = arrMin(sortedDownArr);
        System.out.println("Наименьшее число: " + min);
    }

    static int arrayInitLength () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите размер массива");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            throw new IllegalArgumentException("Неправильно вводишь.");
        }
    }

    static double[] arrayFill (int arrayLength) {

        double[] array = new double[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    static double[] arraySortUp (double[] array) {
        int stepsCount = array.length - 1;
        double[] tempArr = array; //Local variable 'tempArr' is redundant???
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (tempArr[i] > tempArr[i + 1]) {
                    double temp = tempArr[i];
                    tempArr[i] = tempArr[i + 1];
                    tempArr[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
        return tempArr;
    }

    static double[] arraySortDown (double[] array) {
        int stepsCount = array.length - 1;
        double[] tempArr = array;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (tempArr[i] < tempArr[i + 1]) {
                    double temp = tempArr[i];
                    tempArr[i] = tempArr[i + 1];
                    tempArr[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
        return tempArr;
    }

    static void arrOutput (double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "; ");
        }
        System.out.println(" ");
    }

    static double arrSum (double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum += array[i];
        }
        return sum;
    }

    static double arrMax (double[] array) {
    return array[0];
    }

    static double arrMin (double[] array) {
        return array[array.length-1];
    }
}