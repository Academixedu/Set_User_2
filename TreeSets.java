import java.util.Iterator;
import java.util.TreeSet;


public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args) {
    TreeSet<Person> p=new TreeSet<>(new BasedOnName());
    p.add(new Person("sai",12,234,"dev"));
    p.add(new Person("fayaz",23,456,"hr"));
    p.add(new Person("kartik",56,99876,"manager"));
    Iterator<Person> i=p.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}

