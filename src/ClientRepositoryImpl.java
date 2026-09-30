import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    private List<Client> clientList;
    @Override
    public Client findById(Long id) {
        for (Client client : clientList) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        throw new IllegalArgumentException("Invalid id");
    }
}
