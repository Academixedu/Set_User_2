import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args) {
    TreeSet<Person> p = new TreeSet<>(new BasedOnName());
    p.add(new Person("sujatha",21,21234,"A"));
    p.add(new Person("swarupa",21,230034,"B"));
    p.add(new Person("kavitha",21,22345,"C"));
      Iterator<Person> i=p.iterator();
      while(i.hasNext()){
        System.out.println(i.next());
      }
    }
  }

