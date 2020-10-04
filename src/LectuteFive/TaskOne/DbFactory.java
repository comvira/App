package LectuteFive.TaskOne;

public class DbFactory extends CalcFactory {
    @Override
    public CalcLog createLog () {
        return new DbLogger();
    }
}