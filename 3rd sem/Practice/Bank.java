package Practice;

import java.util.Scanner;

import static java.lang.System.exit;

class BankAc {
    Scanner sc = new Scanner(System.in);
    private float balance, rate;

    BankAc() {
        System.out.println("enter the initial balance and rate ");

        balance = sc.nextFloat();
        rate = sc.nextFloat();

    }

    void deposit() {
        float deposit;
        System.out.println("Enter the Amount you want to deposit.");
        deposit = sc.nextFloat();
        balance += deposit;
    }

    void withdraw() {
        float withdraw;
        System.out.println("Enter the Amount you want to withdraw.");
        withdraw = sc.nextFloat();
        balance -= withdraw;


    }

    void getbalance() {
        float temp;
        temp = balance + (balance * (rate % 100));
        balance += temp;
        System.out.println("The actual balance is :Rs" + balance);

    }

}

public class Bank {
    public static void main(String[] args) {
        BankAc user = new BankAc();
        while (true) {
            System.out.println("Select:");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            int ch = new Scanner(System.in).nextInt();

            switch (ch) {
                case 1:
                    user.deposit();
                    break;
                case 2:
                    user.withdraw();
                    break;
                case 3:
                    user.getbalance();
                    break;

                case 4:
                    exit(0);
                default:
                    System.out.print("Wrong number");
                    break;



            }
        }

    }
}