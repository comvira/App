package LectuteFive.TaskOne;

public class FileFactory extends CalcFactory {
    @Override
    public CalcLog createLog () {
        return new FileLogger();
    }
}