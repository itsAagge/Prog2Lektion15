package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleArray {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void printPeople() {
        System.out.println(people);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    //Med PeoplePredicate
    /*
    public Person findFirst(PersonPredicate filter) {
        for (Person person : people) {
            if (filter.test(person)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> findAll(PersonPredicate filter) {
        List<Person> foundPeople = new ArrayList<>();
        for (Person person : people) {
            if (filter.test(person)) {
                foundPeople.add(person);
            }
        }
        return foundPeople;
    }
     */

    //Med Javas Predicate<T>
    public Person findFirst(Predicate<Person> filter) {
        for (Person person : people) {
            if (filter.test(person)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> findAll(Predicate<Person> filter) {
        List<Person> foundPeople = new ArrayList<>();
        for (Person person : people) {
            if (filter.test(person)) {
                foundPeople.add(person);
            }
        }
        return foundPeople;
    }
}
