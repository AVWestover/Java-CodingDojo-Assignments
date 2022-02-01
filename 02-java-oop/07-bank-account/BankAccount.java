public class BankAccount{
    //attibutes
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    //statics
    private static int accountsCreated = 0;
    private static int moneyStored = 0;
    //account ceation
    public BankAccount(){
        accountsCreated++;
    }
    //Get account balance
    public double getCheckingBalance(){
        System.out.println("Your checking account balance is " + this.checkingBalance);
        return checkingBalance;
    }
    public double getSavingsBalance(){
        System.out.println("Your savings balance is " + this.savingsBalance);
        return savingsBalance;
    }
    //deposit
    public double depositChecking(int amount){
        this.checkingBalance = this.checkingBalance + amount;
        return checkingBalance;
    }
    public double depositSavings(int amount){
        this.savingsBalance = this.savingsBalance + amount;
        return savingsBalance;
    }
    //withdraw
    public double withdrawChecking(int amount){
        this.checkingBalance = this.checkingBalance - amount;
        return checkingBalance;
    }
    public double withdrawSavings(int amount){
        this.savingsBalance = this.savingsBalance - amount;
        return savingsBalance;
    }
    //display total money 
    public int getMoneyStored() {
        System.out.println(moneyStored);
        return moneyStored;
    }
    //display accounts created
    public int getAccountsCreated() {
        System.out.println(accountsCreated);
        return accountsCreated;
    }
    //
}