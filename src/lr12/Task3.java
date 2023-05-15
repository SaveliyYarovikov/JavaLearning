package lr12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> Filter(List<String> a){
        return a.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        String str = "Напишите функцию, " +
                "Которая принимает на вход список строк И возвращает новый список, " +
                "Содержащий только те Строки, которые начинаются с Большой буквы.";

        List<String> strings = List.of(str.split(" "));

        List<String> strings2 = Filter(strings);

        for (String e : strings2){
            System.out.println(e);
        }

    }
}
