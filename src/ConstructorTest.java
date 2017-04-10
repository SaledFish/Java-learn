import java.util.*;
/**
 * Created by Administrator on 2017/4/10.
 * This program demonstrates object construction.
 */
public class ConstructorTest {
    public static void main(String[] args)
    {
        //fill the staff array with three Employees objects

        Employees[] staff = new Employees[3];

        staff[0] = new Employees("Harry", 40000);
        staff[1] = new Employees(60000);
        staff[2] = new Employees();

        //print out information about all Employees objects

        for(Employees e : staff)
        {
            System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = "
             + e.getSalary());
        }
    }
}

class Employees
{
    private static int nextId;

    private int id;
    private String name = " ";//instance field initialization
    private double salary;

    //static initialization block
    static
    {
        Random generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //object initialization constructors

    {
        id = nextId;
        nextId++;
    }

    //three overloaded constructors

    public Employees(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Employees(double s)
    {
        //calls the Employees(String, double) constructor
        this("Employee #" + nextId, s);

    }

    //the default constructor

    public Employees()
    {
        //name initialazed to "--see below"
        //salary not explicitly set --initialized to 0
        //id initialized in initialization block
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

}
