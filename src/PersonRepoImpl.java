import java.util.List;

public class PersonRepoImpl implements PersonRepo {
    private List<Person> people;

    public PersonRepoImpl(List<Person> people) {
        this.people = people;
    }

    @Override
    public Person findById(Long id) {
        for (Person person : people) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        throw new IllegalArgumentException("Invalid id");
    }
}
