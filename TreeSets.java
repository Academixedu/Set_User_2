import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  
  
  public static void main(String[] args) {
   
  TreeSet t=new TreeSet<>(new BasedOnName());
    
   t.add(new Person(1,"bhanu"));
   t.add(new Person(2,"mani"));

   for (Object object : t) {
    System.out.println(object);
    
   }
   

  
   }
    
   }


   
   




  
