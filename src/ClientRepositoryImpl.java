import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    private List<Client> clientList;

    public ClientRepositoryImpl(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public Client findById(Long id) {
        return clientList.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ClientNotFoundException(id));
    }
    /**
     * Calculate total sum balance by client id
     * @param id the id of the client
     * @return total balance of the client
     */
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
            throw new IllegalArgumentException(String.format("Client not found by id: %d", id));
        }
        for (Account account : found.getAccountList()) {
            totalBalance = totalBalance + account.getBalance();
        }
        return totalBalance;
    }

    public Client findExpensiveClient() {
        int expBalance = 0;
        Client client1 = null;
        for (Client client : clientList) {
            if (client.getBalance() > expBalance) {
                expBalance = client.getBalance();
                client1 = client;
                if (client == null) {
                    throw new IllegalArgumentException(String.format("Client not found"));
                }
            }
        }
        return client1;
    }

    /**
     * The method to calculate sum of min, max balance
     * @return total balnce
     */
    @Override
    public int totalCheapest() {
        int cheapestClient = 0;
        int expensiveClient = 0;
        int expCheapestTotalSum = 0;
        for (Client cLient : clientList) {
            if (cLient.getBalance() < cheapestClient) {
                cheapestClient = cLient.getBalance();
                if (cLient == null) {
                    throw new IllegalArgumentException(String.format("Client in cheapest if not found"));
                }
            }
            if (cLient.getBalance() > expensiveClient) {
                expensiveClient = cLient.getBalance();
                if (cLient == null) {
                    throw new IllegalArgumentException(String.format("Client in expesive if not found"));
                }
            }
            expCheapestTotalSum = cheapestClient + expensiveClient;

        }
        return expCheapestTotalSum;
    }
}
