package Lesson2_Open_Closed_Principle.Example1.BetterCode;

import java.util.List;

public class NotificationSender 
{
    public void sendNotifications(List<Notification> notifications)
    {
        for(Notification notification : notifications)
        {
            notification.send();
        }
    }
}
