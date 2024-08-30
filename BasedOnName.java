package hello2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

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

public class BasedOnName {
  // implements comparator here and make person class as Target <>
  // Prepare a Code for Sorting Order BasedOnName
  public static void main(String[] args) {
    basedonstring cm = new basedonstring();
    TreeSet<person> ts = new TreeSet<person>(cm);
    person p = new person(98, "adcd", 756.8);
    person p1 = new person(87, "avoid", 7787.4);
    person p2 = new person(32, "abcd", 990.56);
    ts.add(p1);
    ts.add(p);
    ts.add(p2);
    for (person person : ts) {
      System.out.println(person);
    }
  }
}

class basedonstring implements Comparator<person> {
  @Override
  public int compare(person o1, person o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
