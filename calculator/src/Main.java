import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int first = 0;
        int second = 0;
        int result = 0;
        System.out.println("Введите первое число");
        if (scanner.hasNextInt()) {
            first = scanner.nextInt();
        } else {
            System.out.println("Иди нахуй");
            System.exit(0);
        }

        System.out.println("Введите второе число");
        if (scanner.hasNextInt()) {
            second = scanner.nextInt();
        } else {
            System.out.println("Пошёл в пизду");
            System.exit(0);
        }

        System.out.println("Выберите операцию:\n +\n -\n *\n /\n %\n ^");
        String operation = scanner.next();

        if (operation.equals("+")) {
            result = first + second;
        } else if (operation.equals("-")) {
            result = first - second;
        } else if (operation.equals("*")) {
            result = first * second;
        } else if (second != 0 && operation.equals("/")) {
            result = first / second;
        } else if (second != 0 && operation.equals("%")) {
            result = first % second;
        } else if (operation.equals("^")) {
            result = (int)Math.pow(first, second);
        } else {
            System.out.println("Всё хуйня, давай по-новой");
            System.exit(0);
        }
        System.out.println(first + " " + operation + " " + second + " = " + result);
        scanner.close();
    }
}