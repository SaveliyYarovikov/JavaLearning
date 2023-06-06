package lr11.CollectionsComparison.LinkedList;


import java.util.LinkedList;

public class LinkedListTimeToGetElementByIndex {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 19999999; i++){
            list.add(i, i + 1);
        }
        long before = System.nanoTime();

        System.out.println(list.get(10000000));

        long after = System.nanoTime();
        long result = (after - before) / 1000000;

        System.out.println("\nЗатрачено времени на операцию: " + result + " мс");
    }
}
