package LectureThree;

public class Phone {
    public Phone(String number, String model, Double weight) {
        this(number, model);
        //this.number = number;
        //this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(){
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

    public void sendMessage(String...num){
        for (String n : num) System.out.println(n);
    }

    String number;
    String model;
    Double weight;
 }
