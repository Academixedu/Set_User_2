import java.util.Comparator;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args){

       Comparator<Person> idComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getPid(), p2.getPid());
        }
    };

    TreeSet<Person> p = new TreeSet<Person>(idComparator);
    p.add(new Person(1, "A", 'M', 987654321));
    p.add(new Person(4, "C", 'M', 234567890));
    p.add(new Person(2, "B", 'F', 123456789));

    for (Person person : p) {
        System.out.println(person);
    }
}
}

      