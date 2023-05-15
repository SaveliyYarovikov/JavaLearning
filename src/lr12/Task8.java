package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task8 {
    public static List<Integer> ListSorter(List<Integer> a, int b){
        return a.stream().filter(x -> x > b).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(200));
        }
        int b = 150;

        List<Integer> list2 = ListSorter(list, b);

        for (int e : list2){
            System.out.println(e);
        }

    }
}
