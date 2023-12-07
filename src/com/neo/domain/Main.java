package com.neo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int shortestCommonSupersequence(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = i + j;
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println("dp[m][n] ::"+dp[m][n]);
        return dp[m][n];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the first string (X): ");
            String X = scanner.nextLine();

            System.out.print("Enter the second string (Y): ");
            String Y = scanner.nextLine();

            int result = shortestCommonSupersequence(X, Y);

            System.out.println("Length of the shortest common supersequence: " + result);

            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                break;
            }

        } while (true);

        scanner.close();
    }
}