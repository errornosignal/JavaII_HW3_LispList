/**
 * JavaII_HW3_LispList
 * LispList Interface
 * @author Reid Nolan
 * @since 10/14/2017
 * @version 1.0
 */
public interface LispList
{
        /**
     * checks for empty list
     * @return true/false
     */
    boolean isEmpty();

    /**
     * if head node not present returns error
     * @return throw new UnsupportedOperationException() / head
     */
    Object head();

    /**
     * if tail node not present returns error
     * @return throw new UnsupportedOperationException() / tail
     */
    LispList tail();

    /**
     * creates object
     * @param Obj Obj
     * @return return new NonEmptyList(obj1, this)
     */
    LispList cons(Object Obj);

    /**
     * merges two lists
     * @param other other
     * @return other / new NonEmptyList(head, other.merge(tail))
     */
    LispList merge(LispList other);
}