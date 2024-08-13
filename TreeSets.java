import java.util.*;


public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator

  public static void main(String[] args) 
  {
     Comparator <Person> c=new BasedOnName();
     Set <Person> s=new TreeSet<>(c)  ;


     s.add(new Person("Shreyash", 22, 9850));
     s.add(new Person("Abhi", 21, 98));
     s.add(new Person("Ratan", 28, 738));
      for (Person person : s) 
      {
          System.out.println(person);  
      }

  }
}