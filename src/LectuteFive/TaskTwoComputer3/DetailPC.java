package LectuteFive.TaskTwoComputer3;

public abstract class DetailPC implements Detail {
    private String name;
    private String volumeMemory;
    private String typeMemory;
    private String manufacturer;
    protected String componentType;//тип детали (Processor, Memory, Disk...)

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getVolumeMemory() {
        return this.volumeMemory;
    }

    @Override
    public String getTypeMemory() {
        return this.typeMemory;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String getComponentType() {
        return this.componentType;
    }

    @Override
    public void setName(String str) {
        this.name = str;
    }

    @Override
    public void setVolumeMemory(String str) {
        this.volumeMemory = str;
    }

    @Override
    public void setTypeMemory(String str) {
        this.typeMemory = str;
    }

    @Override
    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public DetailPC(String name, String volMem, String typeMem, String manufacturerName) {
        this.name = name;
        this.volumeMemory = volMem;
        this.typeMemory = typeMem;
        this.manufacturer = manufacturerName;
    }

    public DetailPC(String manufacturerName) {
        this.manufacturer = manufacturerName;
    }
}