
import java.util.Comparator;

public class BasedOnName implements Comparator<Person1> {
  // implements comparator here and make person class as Target <>
// Prepare a Code for Sorting Order BasedOnName 

    @Override
    public int compare(Person1 o1, Person1 o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
