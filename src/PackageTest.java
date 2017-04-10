import com.horstman.corejava.*;
//the Employee class is define in that package

import static java.lang.System.*;
/**
 * Created by Administrator on 2017/4/10.
 * This program demonstrates the use of package.
 */
public class PackageTest {
    public static void main(String[] args)
    {
        //because of the import statement,we don't have to use com.horstman.corejava.Employee here
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10,1);

        harry.raiseSalary(5);

        //because of the static import statement, we don't have to use System.out here
        out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());

    }
}
