import java.util.Comparator;

public class BasedOnName implements Comparator<Person> {
  // implements comparator here and make person class as Target <>
// Prepare a Code for Sorting Order BasedOnName 

  @Override
  public int compare(Person p1, Person p2)
  {
     return p1.getName().compareTo(p2.getName());
  }
}