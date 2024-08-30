import java.util.TreeSet;
public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args) {
    TreeSet<Person> tt= new TreeSet<>(new treeset2());
    tt.add(new Person(48,"vijay",60.5,22));
    tt.add(new Person(43, "dinesh", 70.7, 20));
    tt.add(new Person(80, "shubham", 65.3, 21));
    tt.add(new Person(45, "modiji", 6, 66));
    tt.add(new Person(290, "rahul", 5.9, 59)); 
    tt.add(new Person(70, "kCR", 80.3, 70));
  
for (Person f: tt) {
System.out.println(f);}
}
}
