package Lesson5_Interface_Segregation_Principle.Example1.ProblematicCode;

public class Admin implements User 
{

    @Override
    public boolean canBuyProduct() 
    {
       return false;
    }

    @Override
    public boolean canAddProduct() 
    {
        return false;
    }

    @Override
    public boolean canModifyProduct() 
    {
        return false;
    }

    @Override
    public boolean canApproveProduct() 
    {
        return false;
    }

    @Override
    public void ApproveProduct() 
    {
        
    }


}
