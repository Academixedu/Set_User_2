private int pid;
    private String pname;
    private double psalary;
    private String pdesignation;
    public Person(int pid, String pname, double psalary, String pdesignation) {
    this.pid = pid;
    this.pname = pname;
    this.psalary = psalary;
    this.pdesignation = pdesignation;
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
    public double getPsalary() {
        return psalary;
    }
    public void setPsalary(double psalary) {
        this.psalary = psalary;
    }
    public String getPdesignation() {
        return pdesignation;
    }
    public void setPdesignation(String pdesignation) {
        this.pdesignation = pdesignation;
    }
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", psalary=" + psalary + ", pdesignation=" + pdesignation
                + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pid;
        result = prime * result + ((pname == null) ? 0 : pname.hashCode());
        long temp;
        temp = Double.doubleToLongBits(psalary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((pdesignation == null) ? 0 : pdesignation.hashCode());
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
        if (Double.doubleToLongBits(psalary) != Double.doubleToLongBits(other.psalary))
            return false;
        if (pdesignation == null) {
            if (other.pdesignation != null)
                return false;
        } else if (!pdesignation.equals(other.pdesignation))
            return false;
        return true;
    }

     @Override

     public int compareTo(Person o) {

        return this.pname.compareTo(o.pname);
     }




}
