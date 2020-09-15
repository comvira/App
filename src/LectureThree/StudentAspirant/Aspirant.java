package LectureThree.StudentAspirant;

class Aspirant extends Student{
    private double averageMark;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public int getScholarship() {
        if (getAverageMark() == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }

}