package Lesson5_Interface_Segregation_Principle.Example1.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        List<User> users = new ArrayList<>();
        
        /**  
          Now on the list of users and you just start calling users.approveProduct(); ,
          then if the users is an instance of  buyer , seller then it just start throwing exception 
          and then yiu start doing check if the user is and instance of Admin only then you just call users.approveProduct();
          then it just start violating not only ISP but also LSP as well.
         **/
        
    }

}
