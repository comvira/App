package LectureTwo;

import java.lang.reflect.Array;

public class TaskNine {
    public static void main(String[] args) {
        int [] in = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        //тут не очень понятно в задании как выводить - как массив с [] или так ?
        for (int i = in.length - 1; i > -1; i --) System.out.print(in[i] + " ");
    }
}
