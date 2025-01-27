import java.util.Scanner;


public class Stringer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        char[] helloArray = n.toCharArray();
        int spaceNum = 0;
        int newLength = 0;

        // Считаем пробелы
        System.out.println("Изначальная строка: ");
        for (int i = 0; i < helloArray.length; i++) {
            System.out.print(helloArray[i]);
            if (helloArray[i] == ' ') {
                spaceNum += 1;
            }
        }
        System.out.println(" ");

        // Создаём новый массив с учётом сокращения пробелов
        System.out.println("Беспробельная строка: ");
        char[] newArray = new char[helloArray.length - spaceNum];
        for (int i = 0; i < helloArray.length; i++) {
            if (helloArray[i] != ' ') {
                newArray[newLength] = helloArray[i];
                System.out.print(newArray[newLength]);
                newLength += 1;
            }
        }
        System.out.println(" ");

        //Разворот строки наоборот
        char[] swapArray = new char[newArray.length];
        for (int i = 0; i <= (newArray.length/2); i++) {
            char temp = newArray[i];
            swapArray[i] = newArray[newArray.length - i - 1];
            swapArray[newArray.length - i - 1] = temp;
        }

        System.out.println("Разворот строки: ");
        String string1 = String.valueOf(swapArray);
        System.out.println(string1);

        //Поиск в строке
        System.out.println("Что хочешь найти?");
        String search = scanner.nextLine();
        if (search.regionMatches(0, string1, 0, search.length())) {
            System.out.println("Есть такое.");
        } else {
            System.out.println("Нет такого.");
        }

    }
}
