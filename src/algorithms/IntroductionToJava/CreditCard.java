package IntroductionToJava;

public class CreditCard {

    private final String Customer;
    private final String bank;
    private final String account;
    private final int limit;
    protected  double balance;

    //Constructor created

    public CreditCard(String cust, String bk, String acnt, int lim,double initialBalance) {


        Customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBalance;

    }

    public String getCustomer() {
        return Customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {


        this(cust,bk, acnt,lim,0.0);


    }
    public boolean charge(double price) {

        if (price + balance > limit){

            return false;
        }

        balance += price;
        return true;

    }

    public void makePayment(double amount)
    {

        balance -= amount;

    }

    public static  void printSummary( CreditCard card){

        System.out.println("Customer = " + card.Customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);


    }
    public static void main(String[] args) {

        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("Edush Didush","New York savings" , "5345 0234 7652 1234", 5000);
        wallet[1] = new CreditCard("Edush Didush","New York checkings " , "3563 9870 7652 2464", 3500);
        wallet[2] = new CreditCard("Edush Didush","New York Finance" , "9870 1234 9874 6457", 2500, 300);

        for (int val = 1; val <= 16; val++) {

            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);


        }

        for (CreditCard card : wallet) {

            CreditCard.printSummary(card);
            while (card.getBalance()> 200.0){



                System.out.println("New balance = " + card.getBalance());
                break;
            }
        }




    }
}
