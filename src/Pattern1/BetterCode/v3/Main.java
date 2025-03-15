package Pattern1.BetterCode.v3;

public class Main 
{
    public static void main(String[] args) {
        
        Builder b = new Builder();
        b.setBrand("Apple");
        b.setName("Iphone 16");
        b.setPrice(20000);

        Product p = new Product(b);
    }

}
// in this version having some problems in code 