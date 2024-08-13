import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args) {
    TreeSet<Person> p = new TreeSet<>();
    p.add(new Person("PSVSAI", 20, "ASSOCIATE", 18000));
    p.add(new Person("MAHESH", 24, "HR", 35000));
    p.add(new Person("VENKATA", 23, "TL", 25550));
    for (Person per : p) {
      System.out.println(per);
    }
  }
}
