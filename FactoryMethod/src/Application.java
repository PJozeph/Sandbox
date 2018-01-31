import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        List<Student> students = (List<Student>) StudentFactory.createStudent();

        Set<Student> studentSet = new HashSet<>(StudentFactory.createStudent());

        System.out.println(students);
        System.out.println();
        System.out.println(studentSet);

    }
}
