package LectuteFive.TaskOne;

import javax.swing.text.TabStop;
import java.util.Scanner;

public class CalculatorRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcType type = null;
        int num1 = 0;
        int num2 = 0;
        char operation = 0;
        double result = 0.0;

        System.out.println("Введите куда лог делать: CONSOLE, FILE или DB");

        if (scanner.hasNextLine()) {
            try {
                type = CalcType.valueOf(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Вы допустили ошибку при вводе log. Попробуйте еще раз.");
                System.exit(0);
            }
        }

        System.out.println("Введите число:");
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
        }

        if (scanner.hasNextInt()) {
            //System.out.println("Введите число:");
            num2 = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
        }

        System.out.println("Введите операцию:");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
        }

         switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                break;
        }

        System.out.println("Результат операции: ");

        CalcFactory factory = null;
        switch (type) {
            case CONSOLE:
                factory = new ConsoleFactory();
                break;
            case DB:
                factory = new DbFactory();
                break;
            case FILE:
                factory = new FileFactory();
                break;
            default:
        }
        if (factory != null) {
            CalcLog calcLog = factory.createLog();
            calcLog.createLog();
        }

        System.out.println(result);
    }
}

