package Lesson4_Liskov_Substitution_Principle.Example1.BetterCode;

public class VISACard extends CreditCard implements InternationalPaymentCompatibleCreditCard
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
    public void intlPayment() {
        System.out.println("VISA Support International Payments");
    }

}
