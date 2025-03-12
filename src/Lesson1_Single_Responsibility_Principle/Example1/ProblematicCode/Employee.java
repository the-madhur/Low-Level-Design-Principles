package Lesson1_Single_Responsibility_Principle.Example1.ProblematicCode;

public class Employee 
{
    private int id;

    public int getId()
    {
        return this.id;
    }

    public String fetchBioData()
    {
        return "Some Bio Data";
    }

    public double calculateSalary()
    {
        return 0;
    }

    public void printPerformnaceData()
    {
        System.out.println("Some performance related data");
    }
    
}
