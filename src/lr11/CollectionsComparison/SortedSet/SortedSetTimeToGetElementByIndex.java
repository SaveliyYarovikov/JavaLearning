package lr11.CollectionsComparison.SortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTimeToGetElementByIndex {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 19999999; i++){
            set.add(i + 1);
        }
        long before = System.nanoTime();

        Iterator iterator = set.iterator();
        for (int i = 0; i < (set.size() / 2) + 1; i++){
            iterator.next();
            if (i == (set.size() / 2)){
                System.out.println(iterator.next());
            }
        }
        long after = System.nanoTime();
        long result = (after - before) / 1000000;

        System.out.println("\nЗатрачено времени на операцию: " + result + " мс");
    }
}
