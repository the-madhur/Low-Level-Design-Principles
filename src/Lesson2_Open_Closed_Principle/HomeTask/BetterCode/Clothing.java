package Lesson2_Open_Closed_Principle.HomeTask.BetterCode;

public class Clothing extends Product 
{
    public Clothing(double price)
    {
        super(price);
    }

    public double getDiscount()
    {
        return price * 0.20; // 20% discount
    }
}
