package functionalinterfaces.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static functionalinterfaces.predicate.MainPredicate.printList;

/**
 * Both Function<T,R> and BiFunction<T, U, R> has a return type shown as either T or R which stands fpr result, meaning a result is expected  for any of these.</br>
 * In addition to Function and BiFunction, there are also UnaryOperat
 */
public class MainFunction {
    public static void main(String[] args) {
        //Predicate Lambda Expression Example
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));
        printList(list);
        printLineSeparator();
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        printList(list);
        printLineSeparator();
        list.addAll(List.of("echo", "easy", "earnest"));
        printList(list);
        printLineSeparator();
        list.removeIf(s -> s.startsWith("ea"));
        printList(list);

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        printLineSeparator();
        printList(list);

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings,"");
        System.out.println(Arrays.toString(emptyStrings));
        printLineSeparator();
        Arrays.setAll(emptyStrings,(i)->""+(i+1)+". ");
        System.out.println(Arrays.toString(emptyStrings));
    }

    private static void printLineSeparator() {
        System.out.println("-----------");
    }
}

