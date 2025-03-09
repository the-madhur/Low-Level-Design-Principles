package Lesson4_Liskov_Substitution_Principle.Example1.BetterCode;

public class MasterCard extends CreditCard implements InternationalPaymentCompatibleCreditCard
{

    @Override
    public void tapAndPay() 
    {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() 
    {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() 
    {
        System.out.println("Swipe and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayments() 
    {
        System.out.println("Mandate Payments impl of MasterCard");
    }

    @Override
    public void intlPayment() {
        System.out.println("Master Card Support International Payments");
    }
    
}
