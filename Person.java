import java.util.Comparator;

public class Person implements Comparator<Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
private int num;
private String name;

public Person(int num, String name) {
    this.num = num;
    this.name = name;
}
public int getNum() {
    return num;
}
public void setNum(int num) {
    this.num = num;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
@Override
public String toString() {
    return "Person [num=" + num + ", name=" + name + "]";
}
@Override
public int compare(Person o1, Person o2) {
    return o1.getName().compareTo(o2.getName());
}


}
