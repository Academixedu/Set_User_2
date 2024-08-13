import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BasedOnName implements Comparator<Person1>{
  @Override
  public int compare(Person1 o1, Person1 o2) {
    return o1.getPers_name().compareTo(o2.getPers_name());
  }
  public static void main(String[] args) {
  // implements comparator here and make person class as Target <>
  Comparator<Person1> p = new BasedOnName();
// Prepare a Code for Sorting Order BasedOnName
Set<Person1> sp = new TreeSet<Person1>(p);
sp.add(new Person1(123, "Jes", 50000, "Front-end"));
sp.add(new Person1(159, "Sus", 60000, "Back-end"));
sp.add(new Person1(147, "halle", 55000, "Full Stack"));
for (Person1 person : sp) {
  System.out.println(person);
}

  } 
}
