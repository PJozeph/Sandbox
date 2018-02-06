import java.util.Arrays;

public class Student {


    private String firstName;
    private String lastName;
    private String [] subjects;


    public Student(String firstName, String lastName, String[] subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
