package Lesson2_Open_Closed_Principle.HomeTask.BetterCode;

public abstract class Product 
{
 protected double price;

 public Product(double price)
 {
    this.price = price;
 }

 public double getPrice()
 {
    return price;
 }

 public abstract double getDiscount();

}
