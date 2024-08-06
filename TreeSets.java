import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

// Main class to demonstrate TreeSet with custom sorting
public class TreeSets {
  public static void main(String[] args) {
      // Create a TreeSet with the custom NameComparator
      Set<Person> peopleSet = new TreeSet<>(new NameComparator());

      // Add Person objects to the TreeSet
      peopleSet.add(new Person("Hemanth", 70000));
      peopleSet.add(new Person("Chaitanya", 74000));
      peopleSet.add(new Person("MMK", 100000));

      // Print the sorted TreeSet
      for (Person person : peopleSet) {
          System.out.println(person);
      }
  }
}