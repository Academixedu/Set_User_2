
public class Person implements Comparable<Person> {
    private String sets;
   

    public String getSets() {
        return sets;
    }

    public Person() {
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public Person(String sets) {
        this.sets = sets;
       
    }

    @Override
    public String toString() {
        return "Person [sets=" + sets  + "]";
    }
    public int compareTo(Person pr)

    {
        return 0;
    }
    // prepare a Person class here and implmenet Getters and
    // Setters,constructor,tostring,Comparable
}
