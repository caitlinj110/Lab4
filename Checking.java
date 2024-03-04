public class Checking extends Account{
    //Allows unlimited deposits and withdrawals for free. //Provides no interest payments. //If the account balance ever drops below $0, the customer is charged a $20 overdraft fee.

    public Checking() {
    }

    public Checking( double balance){
        super((int) balance);
    }
    // OVERDRAFT FEE OF $20
    public void withdrawal(double withdrawalAmount){
        if(getAccountBalance() < 0){
            System.out.print("\nCharging an overdraft fee of $20 due to account balance being under $0\n");
            super.deposit(20);
        }else{
            super.deposit(withdrawalAmount);
        }
    }
    // Interest


}

