package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;

    public ItemSorter(Item[] items) {
         this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {

        Arrays.sort(items, comparator);
//        comparator.compare(this.items);

//        public int compare(Item o1, Item o2) {
//            return Long.compare(o1.getId(), o2.getId());


        return items;
    }
}
