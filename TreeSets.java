import java.util.TreeSet;
public class TreeSets{
  public static void main(String[] args) {
    TreeSet<Person> t=new TreeSet<>();
    t.add(new Person(1,"Revathi",'F',30000));
    t.add(new Person(1,"Revathi",'F',30000));
    t.add(new Person(4,"Ramya",'F',20000));
    t.add(new Person(3,"Prasann",'M',10000));
    t.add(new Person(2,"Bhavya",'F',15000));
    t.add(new Person(5,"Kalyan",'F',25000));
    for(Person p:t){
      System.out.println(p);
    }
  }
}
