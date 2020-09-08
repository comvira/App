package LectureThree;

class Aspirant extends Student{
    private double averageMark;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public double averageMark() {
        return averageMark;
    }

/*    public int getScholarship() {
        if (getAverageMark() == 5.0) {
            return (int) 200;
        } else {
            return 180;
        }*/
    @Override
    public double getAverageMark() {
        if (getAverageMark() == 5.0) {
            return (int) 200.0;
        } else {
            return 180.0;
        }
    }

    @Override
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}