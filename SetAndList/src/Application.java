import java.util.*;

public class Application {


    public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();
  employeeList.add(EmployeeFactory.createEmployee(0,"Kovacs","Emese","kemese@gmail.com",451.12));
  employeeList.add(EmployeeFactory.createEmployee(0,"Molnar","Zyolt","zsolt@gmail.com",555.12));
  employeeList.add(EmployeeFactory.createEmployee(0,"Andra","Molnar","amolnar@gmail.com",320.12));

   Set<Employee> employeeSet = new HashSet<>();
   employeeSet.add(EmployeeFactory.createEmployee(0,"Kovacs","Emese","kemese@gmail.com",451.12));
   employeeSet.add(EmployeeFactory.createEmployee(0,"Molnar","Zyolt","zsolt@gmail.com",555.12));

   // since the employe is equals when they have according to id, Molnar and has the same id az Kovacs, so not able to put in Set

    System.out.println("Print Set: ");
        printCollection(employeeSet);
        System.out.println("Print List: ");
        Collections.sort(employeeList);
        printCollection(employeeList);

    }

    private static void printCollection(Collection<Employee> employees) {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
