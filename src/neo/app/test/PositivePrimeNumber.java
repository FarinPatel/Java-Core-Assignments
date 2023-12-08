package neo.app.test;

import java.util.Scanner;

public class PositivePrimeNumber {
    public static boolean isPrime(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no array elements ::");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements ::");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Array elements ::" + array[i]);
        }
    }
}
