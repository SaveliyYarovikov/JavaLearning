package lr11.CollectionsComparison.SortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOperationsTime {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 1999999; i++){
            set.add(i + 1);
        }
        long before = System.nanoTime();

        removeFromTail(set);

        long after = System.nanoTime();
        long result = after - before;

        System.out.println("\nЗатрачено времени на операцию: " + result + " нс");
    }
    public static void addInHead(SortedSet<Integer> a){
        a.add(a.first() - 1);
    }
    public static void addInTail(SortedSet<Integer> a){
        a.add(a.last() + 1);
    }
    public static void addInMiddle(SortedSet<Integer> a){
        Iterator iterator = a.iterator();
        int numberInMiddle = 0;
        for (int i = 0; i < (a.size() / 2); i++){
            iterator.next();
            if (i == (a.size() / 2) - 1){
                numberInMiddle = (int)iterator.next();
            }
        }
        a.add(numberInMiddle);
    }
    public static void removeFromHead(SortedSet<Integer> a){
        a.remove(a.first());
    }
    public static void removeFromTail(SortedSet<Integer> a){
        a.remove(a.last());
    }
    public static void removeFromMiddle(SortedSet<Integer> a){
        Iterator iterator = a.iterator();
        int numberInMiddle = 0;
        for (int i = 0; i < (a.size() / 2); i++){
            iterator.next();
            if (i == (a.size() / 2) - 1){
                numberInMiddle = (int)iterator.next();
            }
        }
        a.remove(numberInMiddle);
    }

}
