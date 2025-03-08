package Lesson3_Abstract_classes_and_Interfaces.InterfaceDemo;

public class MongoDbRepository implements iRepository
{
    @Override
    public void getUser()
    {
        System.out.println("User from MongoDb ");
    }

}
