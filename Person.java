public class Person implements Comparable<Person> {
    private int p_id;
    private String p_name;
    private int p_age;

    // Constructor
    public Person(int p_id, String p_name, int p_age) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_age = p_age;
    }

    // Getters and Setters
    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_age() {
        return p_age;
    }

    public void setP_age(int p_age) {
        this.p_age = p_age;
    }

    // toString method
    @Override
    public String toString() {
        return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + "]";
    }

    // compareTo method for Comparable
    @Override
    public int compareTo(Person o) {
        return this.p_name.compareTo(o.p_name); // Compare by p_name
    }
}
