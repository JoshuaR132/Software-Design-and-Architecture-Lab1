import java.util.Objects;
class TwoDiceRoll implements Comparable<TwoDiceRoll> {

    private final DiceRoll one;
    private final DiceRoll two;

    public TwoDiceRoll(DiceRoll one, DiceRoll two) {
        this.one = one;
        this.two = two;
    }

    public int getValue() {
        return one.getValue() + two.getValue();
    }

    //The equals implementation is made up of equals() applied to all non-static fields
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TwoDiceRoll that = (TwoDiceRoll) o;
        return this.one.equals(that.one) && this.two.equals(that.two);
    }

    //The hash  implementation is made up of Objects.hash() applied to all non-static fields
    @Override
    public int hashCode() {
        return Objects.hash(one.hashCode(), two.hashCode());
    }


    @Override
    public String toString() {
        return String.format("TwoDiceRoll %s %s", one, two);
    }

    @Override
    public int compareTo(TwoDiceRoll other) {
        if(Objects.isNull(other))
        {
            throw new NullPointerException("other");
        }
        return Integer.compare(this.getValue(), other.getValue());
    }
}
