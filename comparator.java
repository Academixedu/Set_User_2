import java.util.Comparator;

class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getP_name().compareTo(p2.getP_name());
    }
}
