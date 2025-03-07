package Lesson2_Open_Closed_Principle.HomeTask.BetterCode;

public class DiscountCalculator
{
    public double calculateDiscount(Product product)
    {
        return product.getDiscount();  // uses polymorphism
    }

}
