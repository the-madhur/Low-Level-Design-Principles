package Pattern1.BetterCode.v4;

public class Main 
{
    public static void main(String[] args) {
        
        Product p = new Product.Builder()
                            .setName("Iphone 16")
                            .setPrice(57000)
                            .setBrand("Apple")
                            .setDesc("New iphone with A16 Bionic chip")
                            .setCategory("Smartphones")
                            .build();
    }

}