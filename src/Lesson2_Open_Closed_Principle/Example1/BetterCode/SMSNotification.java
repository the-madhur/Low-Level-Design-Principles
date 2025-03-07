package Lesson2_Open_Closed_Principle.Example1.BetterCode;

public class SMSNotification implements Notification 
{
    @Override
    public void send()
    {
        System.out.println("Sending SMS....");
    }

}
