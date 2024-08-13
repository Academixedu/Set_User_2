import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets{

  public static void main(String[] args) {
    TreeSet<Person> treeset = new TreeSet<>(new BasedOnName());
    treeset.add(new Person("Karthik",21, "Eluru"));
    treeset.add(new Person("Sai",20, "Rajmundry"));
    treeset.add(new Person("Fayaz",21, "H.Junction"));
    treeset.add(new Person("Karthik", 21, "Eluru"));
    Iterator<Person> iterator =  treeset.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
