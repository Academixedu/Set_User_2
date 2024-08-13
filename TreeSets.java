import java.util.TreeSet;
import java.util.Iterator;

public class TreeSets{
// prepare an Object for TreeSet and Load Person Class Objects in it 
  // Make the Sorting Order Based on Comparator
  public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add(new String("Ritesh"));
        t.add(new String("Balu"));
        t.add(new String("Alekha"));  
        Iterator i = t.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
    }
}
