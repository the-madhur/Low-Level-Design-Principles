package Pattern1.ProblematicCode;

import java.util.List;

public class Product 
{
    // here we also need to learn order of args while passing value 
    
    private String name;

    private String desc;

    private int price;

    private String brand;
    
    private String category;

    private int discount;

    private String createdAt;

    private String updatedAt;

    private List<String> images;

    Product(String name, String desc, int price, String brand, String category, int discount, String createdAt, String upadatedAt, List<String> images)
    {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = upadatedAt;
        this.images = images;
    }

}
