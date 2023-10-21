import java.util.ArrayList;

public class JavaBank {

    public static void main(String[] args) {

        CardHolder cardHolders = new CardHolder();
        cardHolders.add("AAE-2000-001", "Moisés Paschoalick", 200.33);
        cardHolders.add("CAE-2001-002", "Thiago Faria", 20.33);
        cardHolders.add("CCE-2002-003", "Ana Maria", 2.33);

        ArrayList<BankAccount> accounts = cardHolders.getAll();
        printCardHolders(accounts);

    }

    private static void printCardHolders(ArrayList<BankAccount> bankAccounts) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            BankAccount account = bankAccounts.get(i);
            System.out.printf("Account: %s, Name: %s, Balance: %.2f%n", account.getName(), account.getBalance(), account.getBalance());
        }

    }

}
