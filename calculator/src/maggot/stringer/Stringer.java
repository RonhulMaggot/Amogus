package maggot.stringer;

import java.util.Scanner;


public class Stringer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String arrayInput = scanner.nextLine();
        char[] helloArray = arrayInput.toCharArray();

        // Считаем пробелы
        System.out.println("Число пробелов: " + spaceCount(helloArray));
        System.out.println(" ");

        // Создаём новый массив с учётом сокращения пробелов
        char[] noSpace = spaceDelete(helloArray,spaceCount(helloArray));

        //Разворот строки наоборот
        char[] revString = stringReverse(noSpace);

        String string1 = String.valueOf(revString);
        System.out.println("Разворот строки без пробелов: ");
        System.out.println(string1);

        //Поиск в строке
        System.out.println("Что хочешь найти?");
        int index = stringSearch(revString);
        if (index != -1) {
            System.out.println("Индекс искомой подстроки: " + index);
        }
        else {
            System.out.println("Нет такой подстроки.");
        }

    }

    static int spaceCount(char[] helloArray) {
        int spaceNum = 0;
        for (int i = 0; i < helloArray.length; i++) {
            System.out.print(helloArray[i]);
            if (helloArray[i] == ' ') {
                spaceNum += 1;
            }
        }
        return spaceNum;
    }

    static char[] spaceDelete (char[] helloArray, int spaceNum) {

        int newLength = 0;
        char[] newArray = new char[helloArray.length - spaceNum];
        for (int i = 0; i < helloArray.length; i++) {
            if (helloArray[i] != ' ') {
                newArray[newLength] = helloArray[i];
                newLength += 1;
            }
        }
        return newArray;
    }

    static char[] stringReverse (char[] newArray) {
        char[] swapArray = new char[newArray.length];
        for (int i = 0; i <= (newArray.length/2); i++) {
            char temp = newArray[i];
            swapArray[i] = newArray[newArray.length - i - 1];
            swapArray[newArray.length - i - 1] = temp;
        }
        return swapArray;
    }

    static int stringSearch (char[] array) {
        Scanner scanner = new Scanner(System.in);

        String tempString = scanner.nextLine();
        char[] charSearch = tempString.toCharArray();

        int x = 0;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == charSearch[0] && index == -1) {
                index = i;
                int y = i;
                for (x = 0; x < charSearch.length; x++, y++) {
                    if (charSearch[x] != array[y]) {
                        index = -1;
                        break;
                    }
                }
            }
        }
        if (x == charSearch.length) {
            return index;
        } else {
            return -1;
        }
    }
}
