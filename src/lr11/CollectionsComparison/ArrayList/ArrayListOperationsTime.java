package lr11.CollectionsComparison.ArrayList;

import java.util.ArrayList;

public class ArrayListOperationsTime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1999999; i++){
            list.add(i, i + 1);
        }
        long before = System.nanoTime();

        addInTail(list, 1);

        long after = System.nanoTime();
        long result = after - before;

        System.out.println("\nЗатрачено времени на операцию: " + result + " нс");
    }
    public static void addInHead(ArrayList<Integer> list, int element){
        list.add(0, element);
    }
    public static void addInTail(ArrayList<Integer> list, int element){
        list.add(list.size() - 1, element);
    }
    public static void addInMiddle(ArrayList<Integer> list, int element){
        list.add(list.size() / 2, element);
    }
    public static void removeFromHead(ArrayList<Integer> list){
        list.remove(0);
    }
    public static void removeFromTail(ArrayList<Integer> list){
        list.remove(list.size() - 1);
    }
    public static void removeFromMiddle(ArrayList<Integer> list){
        list.remove(list.size() / 2);
    }
}
