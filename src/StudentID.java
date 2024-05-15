import java.util.Objects;

public class StudentID {
    private String studentID;
    private String name;

    public StudentID(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    @Override
    public String toString() {
        return "StudentID{" + "studentID='" + studentID + '\'' + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentID that = (StudentID) o;
        return Objects.equals(studentID, that.studentID);
    }

    public boolean validate() {
        // Add validation logic here
        return true;
    }

    public int compareTo(StudentID other) {
        // Add comparison logic here
        return 0;
    }
}
