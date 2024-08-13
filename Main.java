import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

// Person class definition
class Person {
    private int id;
    private String name;
    private int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Custom comparator to sort by name
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        // Create a TreeSet with the custom comparator
        TreeSet<Person> t = new TreeSet<>(nameComparator);
        t.add(new Person(1, "Abhishek", 4000));
        t.add(new Person(2, "Fayaz", 5000));
        t.add(new Person(3, "Chanakya", 4500));

        // Iterate through the TreeSet
        Iterator<Person> i = t.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
