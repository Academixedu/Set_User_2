public class Person implements Comparable<Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable\
private String name;
private int id;
private int sal;
private String desg;
@Override
public String toString() {
    return "Person [name=" + name + ", id=" + id + ", sal=" + sal + ", desg=" + desg + "]";
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getSal() {
    return sal;
}
public void setSal(int sal) {
    this.sal = sal;
}
public String getDesg() {
    return desg;
}
public Person(String name, int id, int sal, String desg) {
    this.name = name;
    this.id = id;
    this.sal = sal;
    this.desg = desg;
}
public void setDesg(String desg) {
    this.desg = desg;
}
@Override
public int compareTo(Person p) {
    return 0;
    
}

}
