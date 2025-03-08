package Lesson3_Abstract_classes_and_Interfaces.InterfaceDemo;

public class Service 
{
    public static void main(String[] args) 
    {
        iRepository repo = new MySQLRepository();
        //iRepository repo;
        
        repo.getUser();
        
    }

}
