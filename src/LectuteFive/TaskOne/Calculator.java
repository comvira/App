package LectuteFive.TaskOne;

public class Calculator {
    public double calculation(int num1, int num2, char operation){
        double result = 0.0;
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

        return result;
    }

    public void calclog(CalcType type){
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
    }
}
