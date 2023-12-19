package neo.app.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentElements {

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,2,3};
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                map.put(arr[i], ++count);
            } else {
                map.put(arr[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> value = map.entrySet().stream()
                .filter(e -> e.getValue() >= k)
                .collect(Collectors.toMap(a -> a.getKey(), a -> a.getValue()));
        value.forEach((s, v) -> {
            list.add(s);
        });

        System.out.println(list.toString());
    }
}

