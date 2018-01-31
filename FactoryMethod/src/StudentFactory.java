
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class StudentFactory {


    public static Collection<Student> createStudent(){

        Collection<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Emese","Kovacs",new String[]{"History","Math"}));
        studentList.add(new Student("Tunde","Kovacs",new String[]{"Biology","Math"}));
        studentList.add(new ProgrammerStudent("Pallagi","Jozsef",new String[]{"Biology","Math"},"Java"));

        return studentList;
    }
}
