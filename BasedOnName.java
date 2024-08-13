import java.util.Comparator;
  // implements comparator here and make person class as Target <>
// Prepare a Code for Sorting Order BasedOnName
public class BasedOnName implements Comparator<Person> {
  @Override
  public int compare(Person p1, Person p2){
    return p1.getName().compareTo(p2.getName());
  }
 
}
