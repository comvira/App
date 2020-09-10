package LectureThree;

public class StudentRun {
    static Student[] s = new Student[2];
    //static Aspirant[] a = new Aspirant[][1];
    public static void main(String[] args) {
        s[0] = new Student("A", "B","C",5.0);
/*        if (s[0] instanceof Aspirant){
            Aspirant as = (Aspirant) s[0];
            System.out.println(as.getScholarship());
        }*/
        s[1]=new Aspirant("D", "F","G",5.0);

        for (int i = 0; i<2; i++){
            System.out.println(s[i].getScholarship());
        }
    }
}
