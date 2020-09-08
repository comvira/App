package LectureThree;

class Student {
    private double averageMark;
    private String firstName;
    private String lastName;
    private String group;
    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    public int getScholarship() {
        if (getAverageMark() == 5.0) {
            return (int) 100;
        } else {
            return 80;
        }
    }
}
