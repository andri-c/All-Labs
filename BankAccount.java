
/**
 * The BankAccount class simulates a savings account that earns monthly interest. This includes having withdrawls, deposits, and other things!
 * 1) Include defined variables for balance, deposit, withdraw, interest, and monthly interest rate
 * 2) have a no-args constructor that that has a "default" value
 * 3) constructor when there is a different balance and interest rate
 * 4) add returns and deposits
 * 5) calculate monthly interest by taking balance and multiplying by monthly interest rate
 * 
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 10/19/2025
 */
public class BankAccount {
    private double balance;      
    private double deposit;       
    private double withdraw;      
    private double interest;       
    private double monthlyIntRate; 
    
    /**
     * No-arg constructor that initializes default values.
     * Sets monthly interest rate to 4.4% annually divided by 12.
     * Sets all other instance variables to 0.
     */
    public BankAccount() {
        monthlyIntRate = 0.044 / 12;
        balance = 0;
        deposit = 0;
        withdraw = 0;
        interest = 0;
    }

    /**
     * Constructor that accepts starting balance and annual interest rate.
     * @param inBalance the starting balance (whole dollar)
     * @param intRate the annual interest rate as a percent (e.g. 3.5 for 3.5%)
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
        deposit = 0;
        withdraw = 0;
        interest = 0;
    }

    /**
     * Constructor that accepts starting balance and annual interest rate (in decimal or double).
     * @param inBalance the starting balance
     * @param intRate the annual interest rate as a percent (e.g. 3.5 for 3.5%)
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
        deposit = 0;
        withdraw = 0;
        interest = 0;
    }

   
    /** @return the current account balance */
    public double getBalance() {
        return balance;
    }

    /** @return the total amount deposited */
    public double getDeposit() {
        return deposit;
    }

    /** @return the total amount withdrawn */
    public double getWithdraw() {
        return withdraw;
    }

    /** @return the total interest earned */
    public double getInterest() {
        return interest;
    }

    
    /**
     * Adds the specified amount to the balance and tracks total deposits.
     * @param add the deposit amount (double)
     */
    public void makeDeposit(double add) {
        if (add > 0) {
            balance += add;
            deposit += add;
        }
    }

    /**
     * Adds the specified amount to the balance and tracks total deposits.
     * @param add the deposit amount (int)
     */
    public void makeDeposit(int add) {
        makeDeposit((double)add);
    }

    /**
     * Subtracts the specified amount from the balance and tracks total withdrawals.
     * @param sub the withdrawal amount (double)
     */
    public void makeWithdraw(double sub) {
        if (sub > 0 && sub <= balance) {
            balance -= sub;
            withdraw += sub;
        }
    }

    /**
     * Subtracts the specified amount from the balance and tracks total withdrawals.
     * @param sub the withdrawal amount (int)
     */
    public void makeWithdraw(int sub) {
        makeWithdraw((double)sub);
    }

    /**
     * Calculates and applies monthly interest to the balance.
     * Only applies if balance is greater than zero.
     */
    public void calcInterest() {
        if (balance > 0) {
            double monthlyInterest = balance * monthlyIntRate;
            balance += monthlyInterest;
            interest += monthlyInterest;
        }
    }

}
