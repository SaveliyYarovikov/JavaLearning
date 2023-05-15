package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static List<String> Filter(List<String> a){
        return a.stream().filter(s -> s.matches("[а-яА-Я]+")).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        String str = "Напишите функцию124, " +
                "Которая22 принимает на вход список строк И1 возвращает16 новый список, " +
                "Содержащий только33 те Строки2, которые начинаются2 с Большой3 буквы.";

        List<String> strings = List.of(str.split(" "));

        List<String> strings2 = Filter(strings);

        for (String e : strings2){
            System.out.println(e);
        }

    }
}
