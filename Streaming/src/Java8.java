import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {

        List<String>  letters = Arrays.asList("a","b","c");
        System.out.println(letters);

        List<String>  upperCsaeLetters =  letters.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCsaeLetters);

        List<Employee> employees = (List<Employee>) EmployeeFactory.createEmployees();

        Calculator calculator = new Calculator(employees);
        calculator.getAllSalary();

        List <String> names = employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());

        System.out.println(names);

    }
}
