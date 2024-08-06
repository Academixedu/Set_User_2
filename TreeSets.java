import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public static void main(String[] args){

  Comparator<Person> pp = new BasedOnName();

 Set <Person> p =new TreeSet<>(pp);

 p.add(new Person(1,"A", 300.0, "doctor"));
 p.add(new Person(1,"C", 200.0, "driver"));
 p.add(new Person(2, "X", 4500.00, "lawyer"));
 p.add(new Person(3, "P", 100.50, "Teacher"));

 for(Person x:p){
  System.out.println(x);
 }



}
