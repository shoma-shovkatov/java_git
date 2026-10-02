public class Account {
    int id;
    int balance;
    String login;
    String pass;

    public Account(int id, int balance, String login, String pass) {
        this.id = id;
        this.balance = balance;
        this.login = login;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
}
