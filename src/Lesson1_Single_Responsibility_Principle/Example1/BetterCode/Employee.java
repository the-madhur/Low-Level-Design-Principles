package Lesson1_Single_Responsibility_Principle.Example1.BetterCode;

public class Employee 
{
    private final int employeeId;

    public Employee(int id)
    {
        this.employeeId = id;
    }

    public int getId()
    {
        return this.employeeId;
    }
}
