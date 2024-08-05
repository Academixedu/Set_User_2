import java.util.Comparator;

import java.util.TreeSet;
public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
public static void main(String[] args) {
  Comparator <Person> p= new BasedOnName();
  TreeSet <Person> s = new TreeSet <Person>(p);
  s.add(new Person("shanmukh", 22));
  s.add(new Person("jaanu", 23));
  s.add(new Person("Gita", 22));
  s.add(new Person("mahathi", 25));
  for(Person p1:s){
    System.out.println(p1);
  }
}

  // Make the Sorting Order Based on Comparator

}
