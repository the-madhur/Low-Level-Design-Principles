package Lesson3_Abstract_classes_and_Interfaces.AbstractClassDemo;

public abstract class Product 
{
    public abstract double calculateDiscount();

    public void termsAndConditions()
    {
        System.out.println("Some Terms and Conditions");
    }
}
