 package collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSets{
  // prepare an Object for TreeSet and Load Person Class Objects in it 
    // Make the Sorting Order Based on Comparator
  
  public static void main(String[] args){
  
    Comparator<Person>  pp= new BasedOnName();

    Set <Person> p =new TreeSet<>(pp);
   
   p.add(new Person(1,"Bharath", 5677.0, "dev"));
   p.add(new Person(1,"Shashi", 56476.0, "sdev"));
   p.add(new Person(2, "ravi", 6765.00, "acter"));
   p.add(new Person(3, "manas", 7688.50, "prodev"));
  
   for(Person x:p){
    System.out.println(x);
   }
  }
}
