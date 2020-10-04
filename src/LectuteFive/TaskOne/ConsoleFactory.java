package LectuteFive.TaskOne;

public class ConsoleFactory extends CalcFactory {
    @Override
    public CalcLog createLog () {
        return new ConsoleLogger();
    }
}