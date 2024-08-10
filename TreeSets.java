import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
public static void main(String[] args) {
  Comparator<Person> p = null;
  Scanner in = new Scanner(System.in);
  System.out.println("1. Sort By presonname");
  System.out.println("2. Sort By personsal");
  int choice = in.nextInt();
  if (choice == 1) {
    p=(Comparator<Person>) new BasedOnName();
  } else if (choice == 2) {
    p=(Comparator<Person>) new BasedOnPersonDesg();
  }
 Set<Person> l = new TreeSet<Person>(p);

l.add(new Person( "Ranjith", 20000.0, "Developer"));
l.add(new Person( "Ranjith", 20000.0, "Developer"));
l.add(new Person( "Raj", 30000.0,"HR"));

for ( Person p1 : l) {
  System.out.println(p1);
}

  // Make the Sorting Order Based on Comparator
}
}

