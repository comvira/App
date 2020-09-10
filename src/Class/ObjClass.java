package Class;

public class ObjClass {
    static Dog[] abc = new Dog [3];

    public static void main (String[] args){
        abc[0] = new Dog("Billy");
        abc[1] = new Dog("Tom");
        abc[2] = new Dog("Jonny");

        for (int i = 0; i<3; i++){
            System.out.println(abc[i].name);
        }
    }
}

class Dog{
    String name;

    public Dog (String name){
        this.name = name;
    }
}
