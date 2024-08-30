public class Person implements Comparable<Person>{
    private String name;
    private int Id;
    private double pack;
    private int mobileno;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public int getMobileno() {
        return mobileno;
    }
    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }
    public Person(String name, int id, double pack, int mobileno) {
        this.name = name;
        Id = id;
        this.pack = pack;
        this.mobileno = mobileno;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", Id=" + Id + ", pack=" + pack + ", mobileno=" + mobileno + "]";
    }
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.Id,o.getId());
    }
}
