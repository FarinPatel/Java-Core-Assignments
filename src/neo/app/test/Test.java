package neo.app.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 342, 12, 3231);
        List<Integer> collect = integers.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        Integer integer = collect.get(1);
        Integer integer1 = collect.stream().skip(1).max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(integer1);

    }
}
