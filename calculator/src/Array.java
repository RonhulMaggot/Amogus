import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = 0;
        float sum = 0;
        float max = 0;
        float min = 0;

        System.out.println("Введите размер массива");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Иди нахуй");
            System.exit(0);
        }

        if (n <= 0) {
            System.out.println("Иди нахуй");
            System.exit(0);
        }

        float[] array = new float[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (float)Math.random();
        }

        System.out.println("Массив изначальный: ");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println(array[i] + "; ");
        }

        int stepsCount = array.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (array[i] > array[i + 1]) {
                    float temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);

        max = array[array.length-1];
        min = array[0];
        System.out.println("Массив по возрастанию: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "; ");
        }

        stepsCount = array.length - 1;
        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (array[i] < array[i + 1]) {
                    float temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
        System.out.println("Массив по убыванию: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "; ");
        }

        System.out.println("Сумма элементов массива: " + sum);

        System.out.println("Наименьшее число: " + min);

        System.out.println("Наибольшее число: " + max);

        scanner.close();
    }
}