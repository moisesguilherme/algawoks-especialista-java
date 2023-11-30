import com.javabank.account.Account;
import com.javabank.account.InterfaceBankAccount;
import com.javabank.cardholder.CardHolder;
import com.javabank.cardholder.Filter;

import java.util.ArrayList;
import java.util.List;

public class JavaBank {

    public static void main(String[] args) {

        CardHolder cardHolders = new CardHolder();
        cardHolders.add("AAE-2000-001", "Moisés Paschoalick", 200.33);
        cardHolders.add("CAE-2001-002", "Thiago Faria", 20.33);
        //cardHolders.add("CAE-2001-002", "Thiago Faria", 20.33);
        cardHolders.add("CCE-2002-003", "Ana Maria", 2.33);

        //ArrayList<Account> accounts = cardHolders.getAll();
        //int indice = accounts.lastIndexOf(new Account("CAE-2001-002", "Thiago Faria", 20.33));
        //System.out.println(indice);

        Filter<Account> filter = (Account account) -> {
            boolean result = account.getBalance() > 15;
            return result;
        };

        List<Account> accountsFilter = cardHolders.consult(filter);

        System.out.println("------------------------------\n" + InterfaceBankAccount.BANK + "\n------------------------------");
        System.out.println("*** CardHolder with balance filter ***");

        //printCardHolders(accounts);

        for (Account account : accountsFilter) {
            System.out.printf("%s - %f%n", account.getAccountName(), account.getBalance());
        }
    }

    private static void printCardHolders(ArrayList<Account> bankAccounts) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            Account account = bankAccounts.get(i);
            System.out.printf("Account: %s, Name: %s, Balance: %.2f%n", account.getAccountNumber(), account.getAccountName(), account.getBalance());
        }

    }

}
