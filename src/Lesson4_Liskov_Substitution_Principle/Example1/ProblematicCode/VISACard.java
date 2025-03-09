package Lesson4_Liskov_Substitution_Principle.Example1.ProblematicCode;

public class VISACard extends CreditCard
{

    @Override
    public void tapAndPay() 
    {
        System.out.println("Tap and Pay impl of VISA");
    }

    @Override
    public void onlineTransfer() 
    {
        System.out.println("Online Transfer impl of VISA");
    }

    @Override
    public void swipeAndPay() 
    {
        System.out.println("Swipe and Pay impl of VISA");
    }

    @Override
    public void mandatePayments() 
    {
        System.out.println("Mandate Payments impl of VISA");
    }

    @Override
    public void upiPayments() {
        
    }

    @Override
    public void intlPayments() {
        System.out.println("VISA Supports intl payments impl");
    }
    

}
