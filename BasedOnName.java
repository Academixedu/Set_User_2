// Implement the Comparator for Person based on the name

import java.util.Comparator;

class NameComparator implements Comparator<Person> {
  @Override
  public int compare(Person p1, Person p2) {
      return p1.getName().compareTo(p2.getName());
  }
}