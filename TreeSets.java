import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
public static void main(String[] args) {
  
TreeSet<Person1> t1=new TreeSet<>(new BasedOnName());
t1.add(new Person1("Swarupa", 21));
t1.add(new Person1("Sujatha", 22));
  // Make the Sorting Order Based on Comparator
  Iterator<Person1> a1=t1.iterator();
  while(a1.hasNext()){
    System.out.println(a1.next());

  }

}
}
