package Lesson4_Liskov_Substitution_Principle.Example1.ProblematicCode;

public abstract class CreditCard 
{
    private String ownerName;
    private String ccNumber;
    private int cvv;
    
    public void setCcNumber(String ccNumber)
    {
        this.ccNumber = ccNumber;
    }

    public void setCVV(int cvv)
    {
        this.cvv = cvv;
    }
    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }
    
    public abstract void tapAndPay();

    public abstract void onlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayments();

    public void displayCreditCardDetails()
    {
        System.out.println("CC Number: "+this.ccNumber+" , With Owner Name: "+this.ownerName);
    }

}
