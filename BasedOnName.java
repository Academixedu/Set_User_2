import java.util.Comparator;
import java.util.TreeSet;

public class BasedOnName{
  // implements comparator here and make person class as Target <>
// Prepare a Code for Sorting Order BasedOnName 
// Comparator implementation for sorting based on name
public static void main(String[] args) {
  
  Comparator<Person> nameComparator = new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
          return p1.getPname().compareTo(p2.getPname());
      }
  };

  
  TreeSet<Person> p = new TreeSet<Person>(nameComparator);
  p.add(new Person(1, "A", 'M', 987654321));
  p.add(new Person(3, "D", 'F', 123456789));
  p.add(new Person(2, "B", 'M', 897654321));


  for (Person person : p) {
      System.out.println(person);
  }
}

}