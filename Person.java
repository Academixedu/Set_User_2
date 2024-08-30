public class Person implements Comparable<Person>{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
private int pid;
private String pname;
private char pgender;
private double pmobileno;

public int getPid() {
    return pid;
}
public void setPid(int pid) {
    this.pid = pid;
}
public String getPname() {
    return pname;
}
public void setPname(String pname) {
    this.pname = pname;
}
public char getPgender() {
    return pgender;
}
public void setPgender(char pgender) {
    this.pgender = pgender;
}
public double getPmobileno() {
    return pmobileno;
}
public void setPmobileno(double pmobileno) {
    this.pmobileno = pmobileno;
}

public Person(int pid, String pname, char pgender, double pmobileno) {
    this.pid = pid;
    this.pname = pname;
    this.pgender = pgender;
    this.pmobileno = pmobileno;
}

@Override
public String toString() {
    return "Person [pid=" + pid + ", pname=" + pname + ", pgender=" + pgender + ", pmobileno=" + pmobileno + "]";
}

@Override
public int compareTo(Person o) {
    return Integer.compare(this.pid, o.pid);
}



}
