import java.util.Comparator;
public class BasedOnName implements Comparator<Person> {
  // implements comparator here and make person class as Target <>
  public int compare(Person o1, Person o2) {
    return o1.getPersonname().compareTo(o2.getPersonname());
  }
// Prepare a Code for Sorting Order BasedOnName 

}

