import java.util.Objects;

public class Person implements  Comparable<Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable

    private String name;
    private int age;
    private double salary;
    private String desg;

    public Person(String name, int age, double salary, String desg) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.desg = desg;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesg() {
        return desg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    // toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", desg='" + desg + '\'' +
                '}';
    }

    // Comparable implementation
    @Override
    public int compareTo(Person other) {
        // Compare persons based on their names
        return this.name.compareTo(other.name);
    }

    // Optional: Override hashCode and equals if needed
    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, desg);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age &&
               Double.compare(person.salary, salary) == 0 &&
               Objects.equals(name, person.name) &&
               Objects.equals(desg, person.desg);
    }
}


