public class Person{
// prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
    private String pname;
    private int page;
    private String pdesg;
    private double psal;
    public Person(String pname, int page, String pdesg, double psal) {
        this.pname = pname;
        this.page = page;
        this.pdesg = pdesg;
        this.psal = psal;
    }
   
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public String getPdesg() {
        return pdesg;
    }
    public void setPdesg(String pdesg) {
        this.pdesg = pdesg;
    }
    public double getPsal() {
        return psal;
    }
    public void setPsal(double psal) {
        this.psal = psal;
    }

    @Override
    public String toString() {
        return "Person [pname=" + pname + ", page=" + page + ", pdesg=" + pdesg + ", psal=" + psal + "]";
    }

   

    @Override
    public boolean equals(Object obj) {
       
        return super.equals(obj);
    }
}
