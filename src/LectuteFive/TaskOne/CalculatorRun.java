package LectuteFive.TaskOne;

import java.util.Scanner;

public class CalculatorRun {
    static Scanner scanner = new Scanner(System.in);
    private static Object CalcType;
    CalcType type = null;

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char operation = 0;
        System.out.println("Введите число:");
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
        }

        if (scanner.hasNextInt()) {
            System.out.println("Введите число:");
            num2 = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
        }

        System.out.println("Введите операцию:");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
            operation = operation;
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
        }

        for (CalcType type : CalcType) {
            switch (type) {
                case ConsoleLogger:
                    type = new ConsoleLogger();
                    break;
                case FileLogger:
                    type = new FileLogger();
                    break;
                case DbLogger:
                    type = new DbLogger();
                    break;
                default:
            }

            double result = Calc.calc(num1, num2, operation);
            System.out.println("Результат операции: " + result);
        }
    }
}
