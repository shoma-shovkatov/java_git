import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    private List<Client> clientList;

    public ClientRepositoryImpl(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public Client findById(Long id) {
        for (Client client : clientList) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        throw new IllegalArgumentException("Invalid id");
    }
    public int totalByClient(int id) {
        int totalBalance = 0;
        Client found = null;
        for (Client client : clientList) {
            if (client.getId() == (id)) {
                found = client;
                break;
            }
        }
        if (found == null) {
            throw new IllegalArgumentException("Client not found with id: " + id);
        }
        for (Account account : found.getAccountList()) {
            totalBalance = totalBalance + account.getBalance();
        }
        return totalBalance;
    }
}
