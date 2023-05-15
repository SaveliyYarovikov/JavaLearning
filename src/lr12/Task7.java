package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static List<String> Filter(List<String> a, int b){
        return a.stream().filter(s -> s.length() > b).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        String str = "Напишите функцию, " +
                "принимает на вход список строк И возвращает новый список, " +
                "Содержащий только те Строки, которые начинаются с Большой буквы.";

        List<String> strings = List.of(str.split(" "));
        int b = 5;

        List<String> strings2 = Filter(strings, b);

        for (String e : strings2){
            System.out.println(e);
        }

    }
}
