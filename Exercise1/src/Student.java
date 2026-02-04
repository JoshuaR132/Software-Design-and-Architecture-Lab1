
abstract class Student {

    private static final String UNIVERSITY = "Example University";

    private final int studentID;

    private String name = "Unknown";
    private String course = "Undeclared";

    public Student(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static String getUniversity() {
        return UNIVERSITY;
    }

    //abstract methods have no implementation
    public abstract double calculateDegreeClassification();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", major='" + course + '\'' +
                '}';
    }
}