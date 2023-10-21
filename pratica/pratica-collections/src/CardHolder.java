import java.util.ArrayList;

public class CardHolder {

    private final ArrayList<BankAccount> cardHolders = new ArrayList<>();

    public void add(String accountNumber, String name, double balance) {
        BankAccount account = new BankAccount(accountNumber, name, balance);
        cardHolders.add(account);
    }

    public ArrayList<BankAccount> getAll() {
        return cardHolders;
    }

}
