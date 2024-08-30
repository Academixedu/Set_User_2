import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args) {
    Comparator<Person> n=null;
    BasedOnName c=new BasedOnName();
 TreeSet<Person>m=new TreeSet<>(c);
 
  m.add(new Person(1,"same"));
  m.add(new Person(2,"Aame1"));
  Iterator<Person> v=m.iterator();
  while(v.hasNext()){
    System.out.println(v.next());
  }
  
}
}