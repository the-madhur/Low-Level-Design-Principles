package Pattern1.BetterCode.v4;

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
   private Product(Builder b)
    {
        if(b.getPrice() > 0)
        {
            this.price = b.getPrice();
        }
        
        this.name = b.getName();
        this.desc = b.getDesc();
        this.price = b.getPrice();
        this.brand = b.getBrand();
        this.createdAt = b.getCreatedAt();
        this.updatedAt = b.getUpdatedAt();
        this.images = b.getImages(); 
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }
    
    public static class Builder 
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
    Builder()
    {

    }

    public Product build()
    {
        return new Product(this);
    }

    // Setters 

    public Builder setName(String name)
    {
        this.name = name;
        return this;
    }

    public Builder setDesc(String desc)
    {
        this.desc = desc;
        return this;
    }

    public Builder setPrice(int price)
    {
        if(price < 0) return this;  // this validateion we do after creating objects in Main class that does not follow our Situation 2 - Validate the properties befor creating objects
        this.price = price;
        return this;
    }

    public Builder setBrand(String brand)
    {
        this.brand = brand;
        return this;
    }

    public Builder setCategory(String category)
    {
        this.category = category;
        return this;
    }

    // Getters--------------

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }

    public String getDesc()
    {
        return this.desc;
    }

    public String getBrand()
    {
        return this.brand;
    }
    
    public String getCreatedAt()
    {
        return this.createdAt;
    }

    public String getUpdatedAt()
    {
        return this.updatedAt;
    }

    public List<String> getImages()
    {
        return this.images;
    }
}
}
// all the issues and problems that we face in previous versions all are solved in this program