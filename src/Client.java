import java.util.List;

public class Client {
    private Long id;
    private String name;
    private int balance;
    List<Account> accountList;


    public Client(Long id, String name, int balance, List<Account>accountList) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
