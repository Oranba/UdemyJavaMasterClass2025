package functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String firstName, String lastName, int age) {
        @Override
        public String toString() {
            return firstName + " " + lastName + ", age: " + age;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Sally", "Brown", 30),
                new Person("Peppermint", "Patty", 25),
                new Person("Linus", "Van Pelt", 35),
                new Person("Charlie", "Brown", 28),
                new Person("Lucy", "Van Pelt", 22)
        ));
        //using an anunymous class
//        var comparatorLastName = new java.util.Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.lastName().compareTo(o2.lastName());
//            }
//        };

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people);

        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                int result =  o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1,o2): result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };
        people.sort(comparatorMixed);
        System.out.println(people);

    }
}
