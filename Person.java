/**
This class represents a person with a name.
 */
public class Person implements Comparable<Person>
{
    private String name;
    private int age;

    /**
    Constructs a person object
    @param name the person's name
     */
    public Person(String initialName, int initialAge)
    {
        this.name = initialName;
        this.age = initialAge;
    }

    /**
    Gets the person's name
    @return the name
     */
    public String getName()
    {
        return this.name;
    }

    /**
    Gets the person's age
    @return the age
     */
    public int getAge()
    {
        return this.age;
    }

    /**
    returns a string describing this object
    @return a string describing this object
     */
    public String toString()
    {
        return "Name: " + this.name + "; Age: " + this.age;
    }

    /**
    Compares person objects.
    @param other Other person against which to compare
    @return < 0 if this person comes before, 0 if equal,
    > 0 if this person comes after
     */
    public int compareTo(Person other)
    {
        if(this.name.equals(other.name))
        {
            // could replace the if, else if, else with:
            // return this.age - other.age;
            if(this.age < other.age)
            {
                return -1;
            }
            else if(this.age > other.age)
            {
                return 1;

            }
            else
            {
                return 0;
            }
        }
        else
        {
            return this.name.compareTo(other.name);
        }
    }
}

