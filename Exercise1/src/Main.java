import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DiceRoll one = new DiceRoll(1);
        DiceRoll six = new DiceRoll(6);
        TwoDiceRoll two = new TwoDiceRoll(one, one);
        TwoDiceRoll seven = new TwoDiceRoll(one, six);
        TwoDiceRoll twelve = new TwoDiceRoll(six, six);

        System.out.format("Comparing %s to %s: %d%n", two, seven, two.compareTo(seven));
        System.out.format("Comparing %s to %s: %d%n", seven, seven, seven.compareTo(seven));
        System.out.format("Comparing %s to %s: %d%n", twelve, seven, twelve.compareTo(seven));

        List<TwoDiceRoll> unsorted = new ArrayList<>();
        unsorted.add(twelve);
        unsorted.add(two);
        unsorted.add(seven);

        System.out.format("List before sort %n");
        for (TwoDiceRoll roll : unsorted) {
            System.out.format("%s with value %d%n", roll, roll.getValue());
        }

        System.out.format("List after sort %n");
        List<TwoDiceRoll> sorted = unsorted.stream().sorted().toList();
        for (TwoDiceRoll roll : sorted) {
            System.out.format("%s with value %d%n", roll, roll.getValue());
        }
        }
    }
}