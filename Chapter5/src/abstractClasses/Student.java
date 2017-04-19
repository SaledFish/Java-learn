package abstractClasses;

/**
 * Created by Administrator on 2017/4/19.
 */
public class Student extends Person
{
    private String major;

    public Student(String n, String m)
    {
        //pass n to superclass constructor
        super(n);
        major = m;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
