package Collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add( new Employee( "Atul", "34568764568", 14));
        emps.add( new Employee( "Bhuvan", "34568876548", 11));
        emps.add( new Employee( "Bhuvan", "345687987658", 12));

        System.out.println(emps);
        Collections.sort(emps, new IdComparator());
        System.out.println(emps);
        Collections.sort(emps, new NameComparator());
        System.out.println(emps);
        // comparable example

    }

    /*
     * comparable :: jb single value pr sort karna ho, isme compareTo function rahta h jise hm DTO wale class me override karte h
     * comparator :: jb multiple values ke through sort karni ho, jb comparator use karte h to jitni values pr sort karna hota h un sb values ke liye alag alag class bna ke implimenmtation logic likhna hota h.
    *
    *
    * comparator use to sort withn multiple values.
    * */

}
