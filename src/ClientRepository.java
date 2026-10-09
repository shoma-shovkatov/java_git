public interface ClientRepository {
    Client findById(Long id);

    // Get total by client id
    int totalByClient(int id);

    Client findExpensiveClient();

}
