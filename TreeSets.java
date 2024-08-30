import java.util.TreeSet;
public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
public static void main(String[] args) {
  TreeSet<Person> d = new TreeSet<>(new BasedOnName());
d.add(new Person(25, "rohan"));
d.add(new Person(30, "dinesh"));
d.add(new Person(20, "nand kishor"));
for (Person person : d) {
  System.out.println(person);
 }
}
}