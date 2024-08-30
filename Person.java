public class Person implements Comparable<Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
private int id;
private String name;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Person(int id, String name) {
    this.id = id;
    this.name = name;
}
@Override
public String toString() {
    return "Person [id=" + id + ", name=" + name + "]";
}
@Override
public int compareTo(Person o) {
    // TODO Auto-generated method stub
    return Integer.compare(this.id, o.id);
}



}
