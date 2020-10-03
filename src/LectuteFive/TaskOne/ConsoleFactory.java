package LectuteFive.TaskOne;

public abstract class ConsoleFactory extends CalcFactory {
    @Override
    public CalcLog runCalc () {
        return new ConsoleLogger();
    }
}