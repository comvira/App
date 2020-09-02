package LectureTwo;

public class TaskEight {
    public static void main(String[] args) {
        long [] n = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        long max = (long) -1e9;
        int sump = 0;
        int sumn = 0;
        int colp = 0;
        int coln = 0;
        int sumnf = 0;
        for (long a: n)
        {
            if (max < a) max = a;
            if (a > 0) {
                sump += a;
                colp++;
            }
            if (a < 0) {
                if (a % 2 == 0) sumn += a; //вот тут вопрос отрицательное число нужно или sumn -= a
                coln++;
                sumnf += a; //тут тоже ? может так нужно sumnf -= a
            }
        }
        System.out.println(max);
        System.out.println(sump);
        System.out.println(sumn);
        System.out.println(colp);
        System.out.println(coln);
        System.out.println(sumnf / coln);
    }
}
