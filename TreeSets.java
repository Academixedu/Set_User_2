import java.util.Comparator;
import java.util.TreeSet;

public class TreeSets {
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator

  public static void main(String[] args) {
    
  
  TreeSet<Person> t = new TreeSet<>(new BasedOnName());
  t.add(new Person(22, "shoeb"));
  t.add(new Person(24, "mirza"));
  

  
  for (Person f:t){
    System.out.println(f);
  }
}

  
}

