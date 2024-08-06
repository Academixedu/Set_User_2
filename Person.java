public class Person{
    
    public String personname;
    public Double personsal;
    public String persondeg;
    public Person(String personname, Double personsal, String persondeg) {
        this.personname = personname;
        this.personsal = personsal;
        this.persondeg = persondeg;
    }
    public String getPersonname() {
        return personname;
    }
    public void setPersonname(String personname) {
        this.personname = personname;
    }
    public Double getPersonsal() {
        return personsal;
    }
    public void setPersonsal(Double personsal) {
        this.personsal = personsal;
    }
    public String getPersondeg() {
        return persondeg;
    }
    public void setPersondeg(String persondeg) {
        this.persondeg = persondeg;
    }
    @Override
    public String toString() {
        return "Person [personname=" + personname + ", personsal=" + personsal + ", persondeg=" + persondeg + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((personname == null) ? 0 : personname.hashCode());
        result = prime * result + ((personsal == null) ? 0 : personsal.hashCode());
        result = prime * result + ((persondeg == null) ? 0 : persondeg.hashCode());
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
        if (personname == null) {
            if (other.personname != null)
                return false;
        } else if (!personname.equals(other.personname))
            return false;
        if (personsal == null) {
            if (other.personsal != null)
                return false;
        } else if (!personsal.equals(other.personsal))
            return false;
        if (persondeg == null) {
            if (other.persondeg != null)
                return false;
        } else if (!persondeg.equals(other.persondeg))
            return false;
        return true;
    }
    }
    