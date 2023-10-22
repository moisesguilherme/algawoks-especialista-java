package com.javabank.account;

import java.util.Objects;

// Now extends abastract class instead of interface
public class Account extends AbstractBankAccount{

    private int bonusValue;

    public Account() {
        super("Empty", "Empty", 0);
    }

    public Account(String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, (balance + calculateInitialBonusValue(balance)));
        bonusValue = calculateInitialBonusValue(balance);

    }

    // implement abstract method
    public void deposit(int amt) {

        balance=balance+amt;
    }


    public void withDraw(int amt) {
        balance=balance-amt;
   }

   // replace setBalance of super-classe abstract
   public void setBalance(double balance){
       super.setBalance(balance);
       // Especific implementation in this classe
       this.balance =  (balance + calculateInitialBonusValue(balance));
       this.bonusValue = calculateInitialBonusValue(balance);
   }

   private static int calculateInitialBonusValue(double amt) {
        if (amt >=1 && amt <= 100)
            return 10;
        else if(amt <= 300)
            return 20;
        else
            return 30;
   }

    public void print() {
        System.out.println("\nBank Name : " + getBankName() + "\n"
                           + "Account Number: " + accountNumber + "\n"
                           + "Account Holder: " + accountName + "\n"
                           + "Account Balance: " + balance + "\n"
                           + "Initial Bonus : " + bonusValue
        );
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account that = (Account) o;

        if (!Objects.equals(accountNumber, that.accountNumber))
            return false;
        return Objects.equals(accountName, that.accountName);
    }


    public int hashCode() {
        int result = accountNumber != null ? accountNumber.hashCode() : 0;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        return result;
    }


    public String toString() {
        return "Account {" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }

}
