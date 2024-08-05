import java.util.Comparator;
// implements comparator here and make person class as Target <>
public class BasedOnName implements Comparator<Person> { 

 @Override
 public int compare(Person o1, Person o2) {
  //Prepare a Code for Sorting Order BasedOnName 
   return o1.getName().compareTo(o2.getName());
 }

}
