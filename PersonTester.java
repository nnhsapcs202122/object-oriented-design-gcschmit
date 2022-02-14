import java.util.Scanner;

/**
Test class for Comparable Person objects.
 */
public class PersonTester
{
    public static void main(String [] args)
    {
        Person[] people = new Person[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 names and ages: ");
        for (int i = 0; i < 10; i++)
        {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            people[i] = new Person(name, age);
            scanner.nextLine();
        }

        Person firstPerson = people[0];
        Person lastPerson = people[0];
        for(Person person : people)
        {
            if(person.compareTo(firstPerson) < 0)
            {
                firstPerson = person;
            }
            
            if(person.compareTo(lastPerson) > 0)
            {
                lastPerson = person;
            }
        }

        System.out.println( "First: " + firstPerson );
        System.out.println( "Last: " + lastPerson );
    }
}
