import java.util.Comparator;
import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator

  public static void main(String[] args) {
    Comparator<Person>c=new BasedOnName();

    TreeSet <Person> t=new TreeSet<>(c);

    t.add(new Person(22, "shreyash", 120000, "Dev"));
    t.add(new Person(21, "sarvesh", 120000, "Dev"));
    t.add(new Person(22, "abhi", 120000, "Dev"));

for(Person p:t){
  System.out.println(p);
}




  }





}
