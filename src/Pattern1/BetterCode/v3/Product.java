package Pattern1.BetterCode.v3;

import java.util.List;

public class Product 
{
    private String name;

    private String desc;

    private int price;

    private String brand;
    
    private String category;

    private int discount;

    private String createdAt;

    private String updatedAt;

    private List<String> images;

    // default Constructor
    Product(Builder b)    // create instance of Builder b
    {
        if(b.getPrice() > 0)
        {
            this.price = b.getPrice();
        }
        this.name = b.getName();
        // ......... 
    }
    
}
// in this version having some problems in code 