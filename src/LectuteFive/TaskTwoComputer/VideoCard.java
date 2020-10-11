package LectuteFive.TaskTwoComputer;

public class VideoCard implements NewComputer{
    private String manufacture;
    private String memoryType;
    private int memorySize;
    private int frequency;
    private boolean cooling; //охлаждение(активное или пассивное)
    private String scooling;

    public VideoCard(String manufacture, String memoryType, int memorySize, int frequency, boolean cooling) {
        this.manufacture = manufacture;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.frequency = frequency;
        this.cooling = cooling;
    }

    public void createComputer() {
        System.out.println("Производитель: "+manufacture);
        System.out.println("Тип памяти: "+memoryType);
        System.out.println("Объём памяти: "+memorySize);
        System.out.println("Частота: "+frequency);

        /*if (cooling = true) {
            scooling = "Активное";
        } else {
            scooling = "Пассивное";
        }*/



        if (cooling = true) {
            CoolingContext coolingContext = new CoolingContext(new CoolingActive());
            scooling = coolingContext.cooling();
        } else {
            CoolingContext coolingContext = new CoolingContext(new CoolingPassive());
            scooling = coolingContext.cooling();
        }


        System.out.println("Охлаждение: "+scooling);
    }
}
