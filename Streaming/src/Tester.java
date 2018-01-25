

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tester {


    private Calculator calculator;

    @Before
    public void ini(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Anna", 400.100));
        employees.add(new Employee(0, "Emse", 300.100));
        employees.add(new Employee(0, "Ildiko", 600.100));
        calculator = new Calculator(employees);

    }

    @Test
    public void collectAllSalaryTest(){
        Assert.assertEquals(1300,calculator.getAllSalary(),0.9);
    }
}
