package Pattern1.BetterCode.v4;

public class Main 
{
    public static void main(String[] args) {
        
        Builder b = Product.getBuilder();
        b.setBrand("Apple");
        b.setName("Iphone 16");
        b.setPrice(20000);

        
    }

}