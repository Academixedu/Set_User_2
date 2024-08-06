import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasedOnName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPname().compareTo(p2.getPname());
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice", 50000, "Developer"));
        people.add(new Person(2, "Bob", 60000, "Manager"));
        people.add(new Person(3, "Charlie", 55000, "Analyst"));

        System.out.println("Before Sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, new BasedOnName());

        System.out.println("\nAfter Sorting:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
