public class Prefix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        // Construct prefix sum array
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        // Function to get sum of range [l, r]
        System.out.println("Sum of range [1, 3]: " + getRangeSum(prefixSum, 1, 3));
        System.out.println("Sum of range [2, 4]: " + getRangeSum(prefixSum, 2, 4));
    }
    
    public static int getRangeSum(int[] prefixSum, int l, int r) {
        if (l == 0) {
            return prefixSum[r];
        }
        return prefixSum[r] - prefixSum[l - 1];
    }
}