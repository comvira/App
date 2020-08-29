import java.util.Scanner;

public class Largest_ascending_array_slice {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int  max = 1, i, j, counter = 1, flag;
        int N = in.nextInt();
        int [] array =new int [N];
        for (i = 0; i < N;i++)
            array[i] = in.nextInt();
        for (i = 0; i < N - 1;i++) {
            if (array [i] < array [i + 1]) counter++;
            else counter = 1;
            if (counter > max) max = counter;
        }
        System.out.println (max);
        for (i=0; i < N - max + 1;i++){
            flag= 0 ;
            for (j = i;j <= i + max - 2;j++){
                if (array [j] <array[j + 1]) flag++;
            }
            if (flag == max - 1) {
                for (j = i; j <= i + max -1; j++) System.out.print (array [j]+" ");
            System.out.printf("\n");
            }
        }

    }
}