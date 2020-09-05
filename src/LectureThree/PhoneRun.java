package LectureThree;

public class PhoneRun {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+123","Nokia",200.0);
        Phone phone2 = new Phone("SN456","Motorola",150.5);
        Phone phone3 = new Phone("+789","Asus",165.0);
        System.out.println(phone1.number + " " +phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " +phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " +phone3.model + " " + phone3.weight);
        phone1.receiveCall("FF");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("AA","+000");
        phone2.sendMessage("+111","+222","*333");
    }
}
