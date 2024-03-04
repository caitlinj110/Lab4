public class Account {
    private  int accountNum;
    private double accountBalance;
    private static  int Count=1001;

    public Account() {
        this.accountNum=Count++;
        this.accountBalance=0;

    }

    public Account(int accountBalance){
        this.accountNum=accountBalance++;
        this.accountBalance=accountBalance;

    }

    public int getAccountNum() {

        return accountNum;
    }

    public double getAccountBalance(){

        return accountBalance;
    }
    public void setAccountBalance(double accountBalance){

        this.accountBalance=accountBalance;
    }
    public void withdrawal(double amount){

        accountBalance-=amount;
    }
    public void deposit(double amount){

        accountBalance+=amount;
    }


}
