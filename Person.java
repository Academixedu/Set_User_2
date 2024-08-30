import java.util.*;

class person1 implements Comparable<person1> {
    private String name;
    private int n;
    private double salary;

    person1(String name, int n, double salary) {
        this.name = name;
        this.n = n;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "person1 [name=" + name + ", n=" + n + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(person1 o) {
        return Double.compare(this.salary, o.salary);
    }

}

public class Person {
    // prepare a Person class here and implmenet Getters and
    // Setters,constructor,tostring,Comparable
    public static void main(String[] args) {
        TreeSet<person1> ch = new TreeSet<person1>();
        person1 ps = new person1("name", 13, 78.87);
        person1 ps1 = new person1("hello", 12, 4.56);
        person1 ps3 = new person1("jpmorgan", 56, 34.78);
        ch.add(ps);
        ch.add(ps1);
        ch.add(ps3);
        System.out.println("the ascending order of salary :");
        for (person1 p : ch) {
            System.out.println(p);
        }

    }
}
