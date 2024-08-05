import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
public static void main(String[] args) {
Set<Person> list = new TreeSet<Person>();
list.add(new Person(0, "Ranji", 0, null));
list.add(new Person(0, "Sakshi", 0, null));
list.add(new Person(0, "Raj", 0, null));
list.add(new Person(0, "Vishal", 0, null));
for (Person p : list) {
  System.out.println(p);
}

  // Make the Sorting Order Based on Comparator
  Comparator<Person> p = null;
  Scanner in = new Scanner(System.in);
  System.out.println("1. Sort By presonname");
  System.out.println("2. Sort By personid");
  int choice = in.nextInt();
  if (choice == 1) {
    p = (o1, o2) -> o1.getPersonname().compareTo(o2.getPersonname());
  } else if (choice == 2) {
    p = (o1, o2) -> o1.getPersonid().compareTo(o2.getPersonid());
  }
  list.stream().sorted(p).forEach(System.out::println);
}
}


