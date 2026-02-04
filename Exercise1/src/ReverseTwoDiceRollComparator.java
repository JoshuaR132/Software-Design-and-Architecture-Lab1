import java.util.Comparator;
import java.util.Objects;

class ReverseTwoDiceRollComparator implements Comparator<TwoDiceRoll> {
    @Override
    public int compare(TwoDiceRoll o1, TwoDiceRoll o2) {
        if(Objects.isNull(o1))
        {
            throw new NullPointerException("o1");
        }
        if(Objects.isNull(o2))
        {
            throw new NullPointerException("o2");
        }
        return o1.compareTo(o2) * -1;
    }
}