import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
    private List<Employee> employeeList;

    @Before
    public void init(){
        employeeList = new ArrayList<>();
        employeeList.add(EmployeeFactory.createEmployee(0,"Kovacs","Emese","kemese@gmail.com",451.12));
        employeeList.add(EmployeeFactory.createEmployee(1,"Molnar","Zyolt","zsolt@gmail.com",555.12));
        employeeList.add(EmployeeFactory.createEmployee(2,"Andrea","Molnar","amolnar@gmail.com",320.12));
    }

    @Test
    public void sortDescendingBySalary(){
        Collections.sort(employeeList);
        Assert.assertEquals(employeeList.get(0).getFirstName(),"Andrea");

    }
}
