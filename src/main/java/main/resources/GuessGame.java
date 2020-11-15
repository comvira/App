package main.java.main.resources;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Загадоно число от 0 до 9");

        while (true) {
            System.out.println("Угадать нужно - " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Игрок 1 ныбрал: " + guessp1);

            guessp2 = p2.number;
            System.out.println("Игрок 2 ныбрал: " + guessp2);

            guessp3 = p3.number;
            System.out.println("Игрок 3 ныбрал: " + guessp3);

            if (p1isRight == true) {
                p1isRight = true;
            }
            if (p2isRight == true) {
                p2isRight = true;
            }
            if (p3isRight == true) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("1 - " + p1isRight);
                System.out.println("2 - " + p2isRight);
                System.out.println("3 - " + p3isRight);
                System.out.println("End");
                break;
            } else {
                System.out.println("Следующая попытка :(");
            }
        }
    }
}
