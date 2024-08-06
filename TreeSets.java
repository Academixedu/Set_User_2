import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>(new BasedOnName());

        treeSet.add(new Person(1, "Alice", 50000, "Developer"));
        treeSet.add(new Person(2, "Bob", 60000, "Manager"));
        treeSet.add(new Person(3, "Charlie", 55000, "Analyst"));

        for (Person person : treeSet) {
            System.out.println(person);
        }
    }
}
