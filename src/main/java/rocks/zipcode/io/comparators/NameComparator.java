package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {


    public int compare(Item o1, Item o2) {
        String one = o1.name;
        String two = o2.name;
        return one.compareTo(two);
    }
}
