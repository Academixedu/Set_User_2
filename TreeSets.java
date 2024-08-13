import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator

  public static void main(String[] args) {
    TreeSet<Person> p = new TreeSet<>(new BasedOnName());
    p.add(new Person("pavani",22,20000,"A"));
    p.add(new Person("ganesh",23,23000,"B"));
    p.add(new Person("rams",18,21000,"C"));
      Iterator<Person> i=p.iterator();
      while(i.hasNext()){
        System.out.println(i.next());
      }
    }
  }
