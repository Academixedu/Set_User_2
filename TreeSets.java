import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;
public class TreeSets{
  public static void main(String[] args) {
    BasedOnName b=new BasedOnName();
TreeSet<Person>t=new TreeSet<>(b);  
t.add(new Person("aman", 1, 12.5, 876545688));
t.add(new Person("saad",2,10.2,897690879));
t.add(new Person("asad",3,17.2,898769087));


Iterator<Person> x=t.iterator();
while (x.hasNext()) {
  System.out.println(x.next());
}
    
  }

}
