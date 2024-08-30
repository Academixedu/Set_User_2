package hello;

import java.util.*;

class person implements Comparable<person> {
  private int n;
  private String name;
  private double salary;

  public person(int n, String name, double salary) {
    this.n = n;
    this.name = name;
    this.salary = salary;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "person [n=" + n + ", name=" + name + ", salary=" + salary + "]";
  }

  @Override
  public int compareTo(person o) {
    return Integer.compare(this.n, o.n);
  }

}

public class TreeSets {
  // prepare an Object for TreeSet and Load Person Class Objects in it
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args) {
    Comparator com = null;
    // com = new basedonStrings();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1.basedonString 2.basedonDouble 3.basedonid ");
    int k = sc.nextInt();
    if (k == 1) {
      com = new basedonStrings();
    } else if (k == 2) {
      com = new baesedondouble();
    } else if (k == 3) {
      com = null;
    }

    TreeSet<person> ts = new TreeSet<person>(com);
    person p = new person(98, "abcd", 756.8);
    person p1 = new person(87, "avoid", 7787.4);
    person p2 = new person(32, "help", 990.56);
    ts.add(p1);
    ts.add(p);
    ts.add(p2);
    for (person person : ts) {
      System.out.println(person);
    }

  }
}

class basedonStrings implements Comparator<person> {
  @Override
  public int compare(person o1, person o2) {
    return o1.getName().compareTo(o2.getName());
  }
}

class baesedondouble implements Comparator<person> {

  @Override
  public int compare(person o1, person o2) {
    return Double.compare(o1.getSalary(), o2.getSalary());
  }

}
