import java.util.Comparator;


public class BasedOnName implements Comparator<Person> {
  // implements comparator here and make person class as Target <>

  @Override
  public int compare(Person o1, Person o2) {
    return o1.getName().compareTo(o2.getName());

  }
}
// Prepare a Code for Sorting Order BasedOnName 

