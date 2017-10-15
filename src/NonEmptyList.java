/**
 * NonEmptyList Class
 *
 * @author Reid Nolan
 * @since 10/14/2017
 * @version 1.0
 */
public class NonEmptyList implements LispList
{
    private Object head;
    private LispList tail;

    /**
     * constructor with parameters
     * @param Obj Obj
     * @param lst lst
     */
    NonEmptyList(Object Obj, LispList lst) {
        head = Obj;
        tail = lst;
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
     * @return false
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * returns head node
     * @return head
     */
    public Object head() {
        return head;
    }

    /**
     * returns tail node
     * @return tail
     */
    public LispList tail() {
        return tail;
    }

    /**
     * overrides toString method
     * @return head() + " " + tail().toString()
     */
    @Override
    public String toString() {
        return head() + " " + tail().toString();
    }

    /**
     * merges two lists
     * @param other other
     * @return new NonEmptyList(head, other.merge(tail))
     */
    public LispList merge(LispList other) {
        return new NonEmptyList(head, other.merge(tail));
    }
}