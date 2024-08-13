import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class BasedOnName{
  // implements comparator here and make person class as Target <>
// Prepare a Code for Sorting Order BasedOnName 
 public static void main(String[] args) {
        // Creating a list of Person objects
        List<Person> personList = new ArrayList<>();
        
        personList.add(new Person(3, "sri",22));
        personList.add(new Person(5,"sanky",23));
        personList.add(new Person(2, "M", 24));
        
        // Sorting the list using PersonNameComparator
        Collections.sort(personList, new PersonNameComparator());
        
        // Printing the sorted list
        for (Person person : personList) {
            System.out.println(person);
        }
        
        // Alternatively, using a TreeSet with the PersonNameComparator
        TreeSet<Person> personSet = new TreeSet<>(new PersonNameComparator());
        personSet.addAll(personList);
        
        System.out.println("Sorted using TreeSet:");
        for (Person person : personSet) {
            System.out.println(person);
        }
}
}