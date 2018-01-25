import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    List<Employee> employeeList;

    public Calculator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public double getAllSalary() {
        return employeeList.stream().mapToDouble((emp) ->emp.getSalary()).summaryStatistics().getSum();

    }
}
