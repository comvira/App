package LectureThree;

public class Animal {
/*    public Animal(String location, String food) {
        this.location = location;
        this.food = food;
    }
    public Animal(){

    }*/

    public static void makeNoise(String eat){
        food = eat;
    }

    public static void makeNoise(String sleep, String name){
        System.out.println("Такое-то животное спит: " + name);
    }

    public static void eat (String eat){
        makeNoise(eat);
    }

    public static void sleep (String name){
        makeNoise("Да",name);
    }

    static String food;
    static String location;

}
