package lr11.HashMap;

import java.util.Collections;
import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(-1,"one");
        hashMap.put(23,"more than five");
        hashMap.put(11," same");
        hashMap.put(3,"one");
        hashMap.put(4,"eaeghresh");
        hashMap.put(5,"hdhdrfjfj");
        hashMap.put(245," same");
        hashMap.put(2,"one");
        hashMap.put(2151,"eaeghresh");
        hashMap.put(35,"hdhdrfjfj");

        int min = Collections.min(hashMap.keySet());
        int max = Collections.max(hashMap.keySet());
        int result = 1;

        System.out.println("Строки, ключ которых больше 5:\n");
        for (int i = 6; i <= max; i++){
            if (hashMap.containsKey(i)){
                System.out.println(hashMap.get(i));
            }
        }

        System.out.println("\nПроизведение ключей с длиной строки больше 5:");
        for (int i = min; i <= max; i++){
            if (hashMap.containsKey(i) && (hashMap.get(i).length() > 5)){
                result *= i;
            }
        }
        System.out.println(result);
    }
}
