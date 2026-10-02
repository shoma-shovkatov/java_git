import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Alina");


        Account account1= new Account(1, 1000, "shams@gmail.com", "qwerty123");
        Account account2= new Account(2, 2000, "shams@gmail.com", "qwerty456");
        Account account3= new Account(3, 3000, "pavel@gmail.com", "qwerty789");
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);


        Client client1 = new Client(1L, "shams", 1111, accountList);
        Client client2 = new Client(2L, "pavel", 2222, accountList);
        List<Client> clientList = new ArrayList<>();
        clientList.add(client1);
        clientList.add(client2);

        ClientRepository clientRepository = new ClientRepositoryImpl(clientList);
        int totalbyCLient = clientRepository.totalByClient(12);
        System.out.println(totalbyCLient);

    }
}
