package com.array;
import java.util.*;
public class TripletArray {
        public static List<List<Integer>> tripleArray(int[] array,int sum) {

            List<Integer> listOfNumbers = new ArrayList<>();
            for (int n1 : array) {
                listOfNumbers.add(n1);
            }

            List<List<Integer>> finalOutput = new ArrayList<>();

            for (int i = 0; i < listOfNumbers.size(); i++) {
                for (int j = i + 1; j < listOfNumbers.size(); j++) {
                    for (int k = j + 1; k < listOfNumbers.size(); k++) {
                        int i1 = listOfNumbers.get(i);
                        int j1 = listOfNumbers.get(j);
                        int k1 = listOfNumbers.get(k);

                        if (i1 + j1 + k1 == sum) {
                            List<Integer> tripletArray = Arrays.asList(i1, j1, k1);
                            tripletArray.sort(Integer::compareTo);
                            if (!finalOutput.contains(tripletArray)) {
                                finalOutput.add(tripletArray);
                            }
                        }
                    }
                }
            }
            return finalOutput;
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
            System.out.println("Enter Sum ::");
            int sum = sc.nextInt();

            List<List<Integer>> threeSum = tripleArray(array,sum);
            System.out.println(threeSum);
        }
    }
