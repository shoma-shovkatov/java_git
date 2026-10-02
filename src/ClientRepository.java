public interface ClientRepository {
    Client findById(Long id);

    int totalByClient(int id);

}
