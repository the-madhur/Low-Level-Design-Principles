package Lesson2_Open_Closed_Principle.Example1.BetterCode;

public class EmailNotification implements Notification
{
    public void send()
    {
        System.out.println("Sending Email....");
    }
}
