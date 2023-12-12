package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumArray {
    public static int maxSum(int arr[],int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (j < arr.length) {
                    sum += arr[j];
                }
            }
            list.add(sum);
        }
        Integer max = null;
        if (!list.isEmpty()) {
             max = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                Integer current = list.get(i);

                if (current != null && current.compareTo(max) > 0) {
                    max = current;
                }
            }
            System.out.println("Maximum value: " + max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no array elements ::");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements ::");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.println("Array elements ::" + array[i]);
        }
        System.out.println("Enter K ::");
        int k = sc.nextInt();

        int maxSum = maxSum(array,k);
        System.out.println("Maximum sum of sub arrays ::"+maxSum);
    }
}
