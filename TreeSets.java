import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
        public static void main(String[] args){

          Comparator<Person> pp = new BasedOnName();

         Set <Person> p =new TreeSet<>(pp);

         p.add(new Person(1,"ABC", 2003.0, "Developer"));
         p.add(new Person(1,"ABC", 2003.0, "Developer"));
         p.add(new Person(2, "XYZ", 200364.00, "HR"));
         p.add(new Person(3, "PQR", 453650.50, "Team Lead"));

         for(Person x:p){
          System.out.println(x);
         }

        
  // Make the Sorting Order Based on Comparator
}
}
