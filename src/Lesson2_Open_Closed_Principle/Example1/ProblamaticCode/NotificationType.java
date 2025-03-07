package Lesson2_Open_Closed_Principle.Example1.ProblamaticCode;

public enum NotificationType 
{

    SMS,

    EMAIL,

    WhatsApp;

    public void sendSmsNotifications()
    {
        System.out.println("Sending an SMS");
    }

    public void sendEmailNotifications()
    {
        System.out.println("Sending an Email");
    }

    public void sendWhatsAppNotification()
    {
        System.out.println("Sending an Email");
    }

}
