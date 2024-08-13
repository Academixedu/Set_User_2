public class Person1 implements Comparable<Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
private int pers_id;
private String pers_name;
private int pers_sal;
public Person1(int pers_id, String pers_name, int pers_sal, String pers_des) {
    this.pers_id = pers_id;
    this.pers_name = pers_name;
    this.pers_sal = pers_sal;
    this.pers_des = pers_des;
}
@Override
public String toString() {
    return "Person [pers_id=" + pers_id + ", pers_name=" + pers_name + ", pers_sal=" + pers_sal + ", pers_des="
            + pers_des + "]";
}
public int getPers_id() {
    return pers_id;
}
public void setPers_id(int pers_id) {
    this.pers_id = pers_id;
}
public String getPers_name() {
    return pers_name;
}
public void setPers_name(String pers_name) {
    this.pers_name = pers_name;
}
public int getPers_sal() {
    return pers_sal;
}
public void setPers_sal(int pers_sal) {
    this.pers_sal = pers_sal;
}
public String getPers_des() {
    return pers_des;
}
public void setPers_des(String pers_des) {
    this.pers_des = pers_des;
}
private String pers_des;
@Override
public int compareTo(Person o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
}

}
