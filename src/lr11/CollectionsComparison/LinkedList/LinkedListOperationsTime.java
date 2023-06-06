package lr11.CollectionsComparison.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedSet;

public class LinkedListOperationsTime {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1999999; i++){
            list.add(i, i + 1);
        }
        long before = System.nanoTime();

        removeFromMiddle(list);

        long after = System.nanoTime();
        long result = after - before;

        System.out.println("\nЗатрачено времени на операцию: " + result + " нс");
    }
    public static void addInHead(LinkedList<Integer> a, int element){
        a.add(0, element);
    }
    public static void addInTail(LinkedList<Integer> a, int element){
        a.add(a.size() - 1, element);
    }
    public static void addInMiddle(LinkedList<Integer> a, int element){
        a.add(a.size() / 2, element);
    }
    public static void removeFromHead(LinkedList<Integer> a){
        a.remove(0);
    }
    public static void removeFromTail(LinkedList<Integer> a){
        a.remove(a.size() - 1);
    }
    public static void removeFromMiddle(LinkedList<Integer> a){
        a.remove(a.size() / 2);
    }
}
