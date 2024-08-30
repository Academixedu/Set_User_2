import java.util.Comparator;
import java.util.TreeSet;
public class BasedOnName implements Comparator<Person1>{
  public static void main(String[] args) {
    TreeSet<Person1> t=new TreeSet<>(new BasedOnName());
    t.add(new Person1(1,"Revathi",'F',30000));
    t.add(new Person1(6,"Revathi",'F',30000));
    t.add(new Person1(4,"Ramya",'F',20000));
    t.add(new Person1(3,"Prasann",'M',10000));
    t.add(new Person1(2,"Bhavya",'F',15000));
    t.add(new Person1(5,"Kalyan",'F',25000));
    for(Person1 p:t){
      System.out.println(p);
    }
  }
@Override
  public int compare(Person1 o1, Person1 o2) {
    return o1.getPname().compareTo(o2.getPname());
  }
}
