package com.horstman.corejava; //the classes in this file are part of this package
import java.util.*; //import statesments come after the package statement
/**
 * Created by Administrator on 2017/4/10.
 */
public class Employee
{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        //GregorianCalendar use 0 for January
        hireDay = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date gerHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary*byPercent / 100;
        salary += raise;
    }


}
