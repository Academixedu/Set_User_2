
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
import java.util.Comparator;

public class Person implements Comparable<Person>{
    private int Id;
    private String name;
    private double salary;
    private int age;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person() {
    }
    public Person(int id, String name, double salary, int age) {
        Id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [Id=" + Id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.Id, o.Id);
    }
   
}

