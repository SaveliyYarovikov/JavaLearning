package lr11.ArrayAndLinkedList;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        long before = System.nanoTime();
        System.out.println("Время до: " + before);
        int N = 100000;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++){
            list.add(i, i + 1);
        }

        int i = 0;
        while (list.size() > 1){
            i++;
            if (i >= list.size()) i = 0;
            list.remove(i);
            if (i >= list.size()) i = 0;
        }

        long after = System.nanoTime();
        System.out.println("\nВремя после: " + after);

        long result = (after - before) / 1000000;

        System.out.println("\nЗатрачено: " + result + " мc");
    }
}
