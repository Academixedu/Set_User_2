public class Person implements Comparable<Person> {
    private String name;
    private double salary;

    // Constructor
    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public double getSalary() {
        return salary;
    }

    // Setter for age
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Person{name='" + name + "', salary=" + salary + "}";
    }

    // Comparable interface implementation
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
