package LectureTwo;

import java.util.Scanner;

public class TaskSex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //в задании были указаны скобки, по этому - они присутствуют
        //если не нужны, то можно и без них сделать :)
        //но, тогда задание мной не полностью понятно, наверно :(
        if (n == 0){
            System.out.println("\"нулевое число\"");
        }
        if (n > 0 && n % 2 == 0){
            System.out.println("\"положительное четное число\"");
        }
        if (n > 0 && n % 2 != 0){
            System.out.println("\"положительное нечетное число\"");
        }
        if (n < 0 && n % 2 == 0){
            System.out.println("\"отрицательное четное число\"");
        }
        if (n < 0 && n % 2 != 0){
            System.out.println("\"отрицательное нечетное число\"");
        }
    }
}
