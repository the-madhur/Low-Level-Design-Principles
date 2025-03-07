package Lesson2_Open_Closed_Principle.HomeTask.BetterCode;

public class Electronics extends Product
{
    public Electronics(double price)
    {
        super(price);
    }

    @Override
    public double getDiscount() 
    {
        return price * 0.10; // 10% discount
    }
}
