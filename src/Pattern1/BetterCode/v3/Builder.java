package Pattern1.BetterCode.v3;

import java.util.List;

public class Builder     //Builder class
{
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

    // and so on..........some few getters.....  
    
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

    // using Setters/Getters 
    public void setName(String name)
    {
        this.name = name;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public void setPrice(int price)
    {
        if(price < 0) return;  // this validateion we do after creating objects in Main class that does not follow our Situation 2 - Validate the properties befor creating objects
        this.price = price;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }
    
}

// in this version having some problems in code 