package LectureThree.Phone;

public class Phone {
    private String number;
    private String model;
    private Double weight;

/*    private Phone(String number, String model, Double weight) {
        this(number, model);
        //this.number = number;
        //this.model = model;
        this.weight = weight;
    }*/

/*    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }*/

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит {" + name + "}");
    }

    public void receiveCall(String name, String numin){
        System.out.println("Звонит {" + name + "} " + numin);
    }

    public String getNumber(){
       return this.number;
    }

    public String getModel() {
        return model;
    }

    public Double getWeight() {
        return weight;
    }

    public void sendMessage(String...num){
        for (String n : num) System.out.println(n);
    }
}
