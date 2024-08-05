public class Person{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
public Person(int i, String string, int j, String string2) {
    
}

public static final int pid = 0;
public Object personname;
public double personsal;
public Object persondesg;

public class person implements Comparable<Person>{
    private int personid;
    private String personname;
    private double personsal;
    private String persondesg;
  
    @Override
    public int compareTo(Person o) {
         return 0;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = pid;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public double getPersonsal() {
        return personsal;
    }

    public void setPersonsal(double personsal) {
        this.personsal = personsal;
    }

    public String getPersondesg() {
        return persondesg;
    }

    public void setPersondesg(String persondesg) {
        this.persondesg = persondesg;
    }

    @Override
    public String toString() {
        return "Person [personid=" + personid + ", personname=" + personname + ", personsal=" + personsal + ", persondesg=" + persondesg + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + personid;
        result = prime * result + ((personname == null) ? 0 : personname.hashCode());
        long temp;
        temp = Double.doubleToLongBits(personsal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((persondesg == null) ? 0 : persondesg.hashCode());
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
        if (personname == null) {
            if (other.personname != null)
                return false;
        } else if (!personname.equals(other.personname))
            return false;
        if (Double.doubleToLongBits(personsal) != Double.doubleToLongBits(other.personsal))
            return false;
        if (persondesg == null) {
            if (other.persondesg != null)
                return false;
        } else if (!persondesg.equals(other.persondesg))
            return false;
        return true;
    }

    public person(int pid, String pname, double psal, String pdesg) {
        this.personid = pid;
        this.personname = pname;
        this.personsal = psal;
        this.persondesg = pdesg;
    }

    public person() {
    }
    
    
    
}

public String getPersonname() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPersonname'");
}

public String getPersonid() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPersonid'");
}

}

    

    


