import java.util.Objects;
class DiceRoll implements Comparable<DiceRoll> {
    private final int value;

    DiceRoll(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        DiceRoll diceRoll = (DiceRoll) o;
        return value == diceRoll.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.format("DiceRoll %d", value);
    }

    @Override
    public int compareTo(DiceRoll other) {
        if(Objects.isNull(other))
        {
            throw new NullPointerException("other");
        }
        return Integer.compare(this.value, other.value);
    }
}