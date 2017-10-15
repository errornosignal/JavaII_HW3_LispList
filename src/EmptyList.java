/**
 * JavaII_HW3_LispList
 * EmptyList Class
 * @author Reid Nolan
 * @since 10/14/2017
 * @version 1.0
 */
public class EmptyList implements LispList
{

    /**
     * constructor
     */
    EmptyList() {
    }

    /**
     * creates object
     * @param obj1 obj1
     * @return new NonEmptyList(obj1, this)
     */
    public LispList cons(Object obj1) {
        return new NonEmptyList(obj1, this);
    }

    /**
     * checks for empty list
     * @return true
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * if head node not present returns error
     * @return new UnsupportedOperationException()
     */
    public Object head() {
        throw new UnsupportedOperationException();
    }

    /**
     * if tail node not present returns error
     * @return new UnsupportedOperationException()
     */
    public LispList tail() {
        throw new UnsupportedOperationException();
    }

    /**
     * overrides toString method
     * @return ""
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * merges two lists
     * @param other other
     * @return other
     */
    public LispList merge(LispList other) {
        return other;
    }
}