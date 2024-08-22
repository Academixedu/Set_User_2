import java.util.TreeSet;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
    public static void main(String[]args){
    TreeSet<Person> p = new TreeSet<>(new BasedOnName());
    p.add(new Person("Mani",21,25000,"dev"));
    p.add(new Person("sai",21,26000,"dev"));
    p.add(new Person("karthik",21,27000,"hr"));
    for (Person person : p) {
      System.out.println(person);


  }
}
}
