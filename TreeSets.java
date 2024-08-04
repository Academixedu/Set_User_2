import java.util.Comparator;
import java.util.TreeSet;


public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  public static void main(String[] args) {
    Comparator<Person> p=new BasedOnName();
  TreeSet<Person> s1 = new TreeSet<Person>(p);
  s1.add(new Person("Nani", 25, "Vizag"));
  s1.add(new Person("Hari", 20, "Vijayawada"));
  s1.add(new Person("Lucky", 30, "Hyderabad"));
  s1.add(new Person("Lucky", 30, "Hyderabad"));
  s1.add(new Person("kiran", 27, "Rajamaundry"));
 for(Person p1:s1){
  System.out.println(p1);
  }
  // Make the Sorting Order Based on Comparator
}
}
