import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSets{
  // prepare an Object for TreeSet and Load Person Class Objects in it 
    // Make the Sorting Order Based on Comparator
  
  public static void main(String[] args){
  
    Comparator<Person> pp = new BasedOnName();

    Set <Person> p =new TreeSet<>(pp);
   
   p.add(new Person(1,"soppi", 300.0, "doctor"));
   p.add(new Person(1,"chinnu", 200.0, "Beautician"));
   p.add(new Person(2, "Tony", 4500.00, "lawyer"));
   p.add(new Person(3, "Pavi", 100.50, "Engineer"));
  
   for(Person x:p){
    System.out.println(x);
   }
  }
}
  


