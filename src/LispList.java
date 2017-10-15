/**
 * LispList Interface
 *
 * @author Reid Nolan
 * @since 10/14/2017
 * @version 1.0
 */
public interface LispList
{
    boolean isEmpty();
    Object head();
    LispList tail();
    LispList cons(Object Obj);
    LispList merge(LispList other);
}