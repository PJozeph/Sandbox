

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Tester {


    private Calculator calculator;

    @Before
    public void ini(){
        List<Employee> employees = (List<Employee>) EmployeeFactory.createEmployees();
        calculator = new Calculator(employees);

    }

    @Test
    public void collectAllSalaryTest(){
        Assert.assertEquals(1300,calculator.getAllSalary(),0.9);
    }
}
