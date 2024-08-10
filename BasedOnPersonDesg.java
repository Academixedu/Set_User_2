import java.util.Comparator;
public class BasedOnPersonDesg implements Comparator<Person> 
{
    public int compare(Person o1, Person o2)
    {
        return o1.getPersondeg().compareTo(o2.getPersondeg());
    }
}
