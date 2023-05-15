package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task4 {

    public static List<Integer> method(List<Integer> a){
        return a.stream().map(x -> x * x).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(200));
        }

        List<Integer> list2 = method(list);

        for (int e : list2){
            System.out.println(e);
        }

    }
}
