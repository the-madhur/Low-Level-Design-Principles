package Lesson5_Interface_Segregation_Principle.Example1.ProblematicCode;

public interface User 
{
    boolean canBuyProduct();

    boolean canAddProduct();

    boolean canModifyProduct();
    
    boolean canApproveProduct();
    
}
