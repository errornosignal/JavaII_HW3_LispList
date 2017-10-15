/**
 * JavaII_HW3_LispList
 * Main Class
 * @author Reid Nolan
 * @since 10/14/2017
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        //print empty list
        LispList list1 = new EmptyList();
        System.out.println("[" + list1 + "]");

        //add to empty list
        LispList list2 = new NonEmptyList("A", new EmptyList());
        System.out.println(list2);

        //prints three nonEmpty lists
        LispList list3 = new NonEmptyList("A", new NonEmptyList("B", new NonEmptyList("C", new EmptyList())));
        System.out.println(list3);

        //consolidate list3 and list4
        LispList list4 = new EmptyList().cons("E").cons("D").cons("C").cons("B").cons("A");
        System.out.println(list4);

        //merge list3 and list4
        System.out.println(list4.merge(list3));
    }
}