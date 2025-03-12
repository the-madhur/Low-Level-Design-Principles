package Lesson2_Open_Closed_Principle.Example1.ProblematicCode;

import java.util.List;

public class NotificationsSender 
{
    public void sendNotifications(List<NotificationType> notificationTypes)
    {
        for(NotificationType type : notificationTypes )
        {
            if(type == NotificationType.SMS)
            {
                type.sendSmsNotifications();
            }
            else if(type == NotificationType.EMAIL)
            {
                type.sendEmailNotifications();
            }
            else if(type == NotificationType.WhatsApp)
            {
                type.sendWhatsAppNotifications();
            }
        }
    }

}
