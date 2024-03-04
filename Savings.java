public class Savings extends Account {
    private int DepositCounter = 0;

    public Savings(double balance) {

        super((int) balance);
    }


    public void withdrawal(double withdrawalAmount) {
        if ((getAccountBalance() - withdrawalAmount) < 500) { // Reminder: IF THE BALANCE GOINGS BELOW $500 THEN SUBTRACT $10 FROM THE TOTAL AMOUNT OF $500
            System.out.println("Charging a fee of $10 because balance is less than $500.");
            super.withdrawal(10);
            super.withdrawal(withdrawalAmount);
        }
    }


        public void accountDeposit ( double depositAmount){
            if (DepositCounter > 5) {
                System.out.print("Charging a fee of $10");
                super.withdrawal(10);
                DepositCounter++;
            } else {
                super.deposit(depositAmount);
                DepositCounter++;
                System.out.print("\nThis deposit is #" + DepositCounter + " to this account.  You have " + (5 - DepositCounter) + " free deposits left.\n");

            }

        }


        //balance gets a yearly 1.5% interest rate
        public void interest () {
            double interest = getAccountBalance() + getAccountBalance() * 0.015;
            System.out.print("Customer earned " + interest + " in interest. ");
        }
    }






