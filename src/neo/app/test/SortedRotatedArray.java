package neo.app.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedRotatedArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,4,5,1,2);
        List<Integer> arr2 = Arrays.asList(4,5,6,7,0,1,2);
        Collections.sort(arr);
        System.out.println("Original Array1 ::"+arr);
        System.out.println("Array1 ::"+arr.get(0));
        Collections.sort(arr2);
        System.out.println("Original Array2 ::"+arr2);
        System.out.println("Array2 ::"+arr2.get(0));
    }
}
