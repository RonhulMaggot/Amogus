package maggot.calculator;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите первое число");
        int first = numberInput();

        System.out.println("Введите второе число");
        int second = numberInput();

        System.out.println("Выберите операцию:\n +\n -\n *\n /\n %\n ^");
        String operation = scanner.next();

        System.out.println(first + " " + operation + " " + second + " = " + calculation(first, second, operation));
        scanner.close();
    }

    static int numberInput() {
        Scanner scanner = new Scanner (System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            throw new IllegalArgumentException("Неправильно вводишь.");
        }
    }

    static int calculation(int first, int second, String operation) {
        if (operation.equals("+")) { //switch case?
            return first + second;
        } else if (operation.equals("-")) {
            return first - second;
        } else if (operation.equals("*")) {
            return first * second;
        } else if (operation.equals("/")) {
            try {
                return first / second;
            } catch (Exception e) {
                throw new ArithmeticException("На ноль делить нельзя, дядя.");
            }
        } else if (operation.equals("%")) {
            try {
                return first % second;
            } catch (Exception e) {
                throw new ArithmeticException("На ноль делить нельзя, дядя.");
            }
        } else if (operation.equals("^")) {
            return (int)Math.pow(first, second);
        } else {
            throw new IllegalArgumentException("Нет такой операции, ебумба.");
        }
    }
}