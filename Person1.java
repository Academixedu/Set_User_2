
import java.util.Comparator;
public class Person1 implements Comparator<Person1> {
    private int pid;
    private String pname;
    private char gen;
    private double sal;
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
    public char getGen() {
        return gen;
    }
    public void setGen(char gen) {
        this.gen = gen;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
     public Person1(int pid, String pname, char gen, double sal) {
        this.pid = pid;
        this.pname = pname;
        this.gen = gen;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", gen=" + gen + ", sal=" + sal + "]";
    }
    @Override
    public int compare(Person1 o1, Person1 o2) {
        return o1.getPname().compareTo(o2.getPname());
    }
}
