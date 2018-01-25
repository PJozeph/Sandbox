
public class EmployeeFactory {


    public static  Employee createEmployee(int id, String firstName, String lastName, String emial, double salary){
        return new Employee(id,firstName,lastName,emial,salary);
    }
}

