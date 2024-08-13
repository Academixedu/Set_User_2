import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
public static void main(String[] args) {
  Comparator<Person0> nameComparator = new Comparator<Person0>() {
    @Override
    public int compare(Person0 o1 , Person0 o2){
      return o1.getPers_name().compareTo(o2.getPers_name());
    }
  };
}
  // Make the Sorting Order Based on Comparator
  Set<Person0> personSet = new TreeSet<>(nameComparator);
  personSet.add(new Person1(123, "John Doe", 50000, "Software Engineer"));
  personSet.add(new Person1(124, "Jane Smith", 60000, "Project Manager"));
  personSet.add(new Person1(125, "Alice Johnson", 55000, "QA Engineer"));
  for (Person0 person : personSet) {
    System.out.println(person);
}
}
