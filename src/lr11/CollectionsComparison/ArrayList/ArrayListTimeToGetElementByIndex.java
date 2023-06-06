package lr11.CollectionsComparison.ArrayList;

import java.util.ArrayList;

public class ArrayListTimeToGetElementByIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 19999999; i++){
            list.add(i, i + 1);
        }
        long before = System.nanoTime();

        System.out.println(list.get(10000000));

        long after = System.nanoTime();
        long result = after - before;

        System.out.println("\nЗатрачено времени на операцию: " + result + " нс");
    }
}
