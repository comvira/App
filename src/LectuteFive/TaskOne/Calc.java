package LectuteFive.TaskOne;

public class Calc {
    private int num1, num2;
    private double result;
    public static double calc(int num1, int num2, char operation){
        double result = 0.0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                break;
        }
        return result;
    }
}
