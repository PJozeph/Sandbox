import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {

        List<String>  letters = Arrays.asList("a","b","c");
        System.out.println(letters);

        List<String>  upperCsaeLetters =  letters.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCsaeLetters);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Anna", 452.100));
        employees.add(new Employee(0, "Emse", 352.100));
        employees.add(new Employee(0, "Ildiko", 652.100));

        List <String> names = employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());

        System.out.println(names);
        
    }
}
