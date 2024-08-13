public class Person implements Comparable<Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
private String name;
private int age;
private int sal;
private String desg;

public Person(String name, int age, int sal, String desg) {
    this.name = name;
    this.age = age;
    this.sal = sal;
    this.desg = desg;
}

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

public int getSal() {
    return sal;
}

public void setSal(int sal) {
    this.sal = sal;
}

public String getDesg() {
    return desg;
}

public void setDesg(String desg) {
    this.desg = desg;
}

@Override
public String toString() {
    return "Person [name=" + name + ", age=" + age + ", sal=" + sal + ", desg=" + desg + "]";
}



@Override
public int compareTo(Person p) {
    return 0; // Default comparison by name

}

}
