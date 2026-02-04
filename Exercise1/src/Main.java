import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DiceRoll one = new DiceRoll(1);
        DiceRoll anotherOne = new DiceRoll(1);
        DiceRoll six = new DiceRoll(6);
        DiceRoll anotherSix = new DiceRoll(6);

        System.out.format("%s%n", six);
        System.out.format("== operator %b%n", six == six);
        System.out.format("== operator %b%n", six == anotherSix);
        System.out.format("equals %b%n", six.equals(anotherSix));
        System.out.format("one hashcode %d%n", one.hashCode());
        System.out.format("anotherOne hashcode %d%n", anotherOne.hashCode());
        System.out.format("six hashcode %d%n", six.hashCode());
        System.out.format("anotherSix hashcode %d%n", anotherSix.hashCode());


        TwoDiceRoll doubleOne = new TwoDiceRoll(one, anotherOne);
        TwoDiceRoll anotherDoubleOne = new TwoDiceRoll(one, anotherOne);

        System.out.format("%s%n", doubleOne);
        System.out.format("== operator %b%n", doubleOne == doubleOne);
        System.out.format("== operator %b%n", doubleOne == anotherDoubleOne);
        System.out.format("equals %b%n", doubleOne.equals(anotherDoubleOne));
        System.out.format("doubleOne hashcode %d%n", doubleOne.hashCode());
        System.out.format("anotherDoubleOne hashcode %d%n", anotherDoubleOne.hashCode());



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

        System.out.format("Using reverse sorting comparator %n");
        ReverseTwoDiceRollComparator comparator = new ReverseTwoDiceRollComparator();
        List<TwoDiceRoll> reverseSorted = unsorted.stream().sorted(comparator).toList();
        for (TwoDiceRoll roll : reverseSorted) {
            System.out.format("%s with value %d%n", roll, roll.getValue());
        }
    }
}