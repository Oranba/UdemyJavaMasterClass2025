package functionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * The predicate interfaces take one or two arguments, and always returns a boolean value.
 * They are used  to test a condition. and if the condition it true, to perform an operation
 *
 * <code>Interface name: Predicate</code></br>
 * <code>Method signature: boolean test(T t)</code></br>
 * <code>Interface name: BiPredicate</code></br>
 * <code>Method signature: boolean test(T t, U u)</code></br>
 *
 */
public class MainPredicate {
    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {

        //Predicate Lambda Expression Example
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));
        printList(list);
        System.out.println("-----------");
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        printList(list);
        System.out.println("-----------");
        list.addAll(List.of("echo", "easy", "earnest"));
        printList(list);
        System.out.println("-----------");
        list.removeIf(s->s.startsWith("ea"));
        printList(list);



    }
}
