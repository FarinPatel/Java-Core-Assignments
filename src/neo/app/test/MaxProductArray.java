package neo.app.test;

public class MaxProductArray {

    private static int maxProductSubArray(int[] arr) {

        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentProduct = 1;
            for (int j = i; j < n; j++) {
                currentProduct = currentProduct * arr[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }
    public static void main(String[] args) {
        int arr1[] = {2, 3, -2, 4};
        int product1 = maxProductSubArray(arr1);
        System.out.println("Product1 ::"+product1);
        int arr2[] = {-1,0,-2};
        int product2 = maxProductSubArray(arr2);
        System.out.println("Product2 ::"+product2);
    }
}
