import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

public class BasedOnName {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice"));
        people.add(new Person("Bob"));
        people.add(new Person("Charlie"));

        // Print the list before sorting
        System.out.println("Before sorting: " + people);

        // Sort the list using the NameComparator
        Collections.sort(people, new NameComparator());

        // Print the list after sorting
        System.out.println("After sorting: " + people);
    }
}

