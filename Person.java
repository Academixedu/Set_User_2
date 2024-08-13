public class Person{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
private int pid;
private String pname;
private double psal;
private String pdegn;
public Person(int pid, String pname, double psal, String pdegn) {
    this.pid = pid;
    this.pname = pname;
    this.psal = psal;
    this.pdegn = pdegn;
}
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
public double getPsal() {
    return psal;
}
public void setPsal(double psal) {
    this.psal = psal;
}
public String getPdegn() {
    return pdegn;
}
public void setPdegn(String pdegn) {
    this.pdegn = pdegn;
}
@Override
public String toString() {
    return "Person [pid=" + pid + ", pname=" + pname + ", psal=" + psal + ", pdegn=" + pdegn + "]";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + pid;
    result = prime * result + ((pname == null) ? 0 : pname.hashCode());
    long temp;
    temp = Double.doubleToLongBits(psal);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((pdegn == null) ? 0 : pdegn.hashCode());
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
    if (pid != other.pid)
        return false;
    if (pname == null) {
        if (other.pname != null)
            return false;
    } else if (!pname.equals(other.pname))
        return false;
    if (Double.doubleToLongBits(psal) != Double.doubleToLongBits(other.psal))
        return false;
    if (pdegn == null) {
        if (other.pdegn != null)
            return false;
    } else if (!pdegn.equals(other.pdegn))
        return false;
    return true;
}











}
