import java.util.ArrayList;
import java.util.Collection;

public class EmployeeFactory {

    public static final Collection<Employee> createEmployees(){
        Collection<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Anna", 400.100));
        employees.add(new Employee(0, "Emse", 300.100));
        employees.add(new Employee(0, "Ildiko", 600.100));
        return employees;
    }
}
