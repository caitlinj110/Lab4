import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int userInput;
            Checking checkingAccount = new Checking(0);
            Savings savingAccount = new Savings(0);

            do {
                System.out.print(
                        "1. Withdraw from Checking\n" +
                        "2. Withdraw from Savings\n" +
                        "3. Deposit to Checking\n" +
                        "4. Deposit to Savings\n" +
                        "5. Balance of Checking\n" +
                        "6. Balance of Savings\n" +
                        "7. Award Interest to Savings now\n" +
                        "8. Quit");
                userInput = sc.nextInt();

                switch (userInput) {
                    case 1:
                        System.out.println("How much would you like to withdraw from Checking?");
                        int withdrawChecking = sc.nextInt();
                        checkingAccount.withdrawal(withdrawChecking);
                        break;
                    case 2:
                        System.out.println("How much would you like to withdraw from Savings?");
                        int withdrawSavings = sc.nextInt();
                        savingAccount.withdrawal(withdrawSavings);
                        break;
                    case 3:
                        System.out.println("How much would you like to deposit into Checking?");
                        int depositChecking = sc.nextInt();
                        checkingAccount.deposit(depositChecking);
                        break;
                    case 4:
                        System.out.println("How much would you like to deposit into Savings?");
                        int depositSavings = sc.nextInt();
                        savingAccount.deposit(depositSavings);
                        break;
                    case 5:
                        System.out.printf("Your balance for checking %s%n is ",checkingAccount.getAccountBalance() );
                        break;
                    case 6:
                        System.out.println("Your balance for savings %s%n is " + savingAccount.getAccountBalance());
                        break;
                    case 7:
                        System.out.println("Customer earned "+ savingAccount.getAccountBalance() + " in interest");// create interest method //savingAccount.Interest()
                        break;
                    case 8:
                        return;

                }
            } while (userInput <8);
        }


    }
