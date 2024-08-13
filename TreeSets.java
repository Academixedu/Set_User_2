import java.util.TreeSet;

public class TreeSets{
  public static void main(String args[]){
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  TreeSet<Person> t=new TreeSet<>();
  t.add(new Person(1, "sanky",21));
t.add(new Person(4,"sri",22));
t.add(new Person(2, "Ram", 34));
for (Person i : t) {
    System.out.println(i);
}
      }}
