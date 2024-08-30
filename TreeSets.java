import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator

  public static void main(String[] args) {
    TreeSet<Person> treeset = new TreeSet<>(new BasedOnName());
    treeset.add(new Person("shubham",21, "napit"));
    treeset.add(new Person("atul",23, "goutham"));
    treeset.add(new Person("vikas",21, "tripathi"));
    treeset.add(new Person("karan", 21, "singh"));
    Iterator<Person> iterator =  treeset.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}