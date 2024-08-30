public class Person implements Comparable <Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
private int sid;
private String name;
private int id;

public Person(int i, String string) {
    //TODO Auto-generated constructor stub
}
public int getSid() {
    return sid;
}
public void setSid(int sid) {
    this.sid = sid;
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
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + sid;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + id;
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (sid != other.sid)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (id != other.id)
        return false;
    return true;
}
@Override
public String toString() {
    return "Person [sid=" + sid + ", name=" + name + ", id=" + id + "]";
}
@Override
public int compareTo(Person o) {
    return Integer.compare(this.id, o.getSid());

}
}






   


