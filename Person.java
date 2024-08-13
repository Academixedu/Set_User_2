
public class Person{
    // prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
       private String name;
       private int age;
       private int sal;
    public Person(final String name, final int age, final int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(final int age) {
        this.age = age;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(final int sal) {
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sal=" + sal + "]";
    }
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (sal != other.sal)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + sal;
        return result;
    }
    
    
    
    }
    
    
    
       
    
    
    