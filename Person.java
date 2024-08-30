public class Person implements Comparable<Person> {
    // Step 1: Define fields
    private String name;
    private int age;

    // Step 2: Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Step 3: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Step 4: Override toString method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    // Step 5: Implement compareTo method
    @Override
    public int compareTo(Person other) {
        // Compare persons by their names (natural ordering)
        return this.name.compareTo(other.name);
    }
}

