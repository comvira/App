package LectuteFive.Test;

public class Detail_Factory {
    public Detail getDetail(Detail_Enum detail) {
        Detail toReturn = null;

        switch (detail) {
            case MONITOR:
                toReturn = new Monitor();//если идти таким путём то без сетторов не обойтись :(
                break;
            case PROCESSOR:
                toReturn = new Processor();
                break;
        }
        return toReturn;
    }
}
