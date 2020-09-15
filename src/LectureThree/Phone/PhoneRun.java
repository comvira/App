package LectureThree.Phone;

public class PhoneRun {
    static Phone[] phones = new Phone[3];
    public static void main(String[] args) {
        phones[0] = new Phone();
        phones[0].setNumber("+123");
        phones[0].setModel("Nokia");
        phones[0].setWeight(200.0);
        phones[1] = new Phone();
        phones[1].setNumber("SN456");
        phones[1].setModel("Motorola");
        phones[1].setWeight(150.5);
        phones[2] = new Phone();
        phones[2] .setNumber("+789");
        phones[2] .setModel("Asus");
        phones[2] .setWeight(165.0);
        for (int i = 0; i <= 2; i++) {
            System.out.println(phones[i].getNumber() + " " + phones[i].getModel() + " " + phones[i].getWeight());
        }
        //тут не очень понял нужно ли следующее в цикл добавлять
        phones[0].receiveCall("FF");
        System.out.println(phones[0].getNumber());
        phones[1].receiveCall("AA","+000");
        phones[2].sendMessage("+111","+222","*333");
    }
}
