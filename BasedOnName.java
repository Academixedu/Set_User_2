import java.util.Comparator;

public class BasedOnName implements Comparator<Person>{

  @Override
  public int compare(Person o1, Person o2) {
    // TODO Auto-generated method stub
   return o1.getSets().compareTo(o2.getSets());
  }

  
  // implements comparator here and make person class as Target <>

// Prepare a Code for Sorting Order BasedOnName 
}
