package Arrays;

public class ProductsofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};

        // Call the function and store the result
        int[] ans = productExceptSelf(arr);

        // Print the resulting array
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    // Function to calculate product of array elements except self
    public static int[] productExceptSelf(int[] nums) {
        int pro = 1;     // To store the product of all non-zero elements
        int zero = 0;    // Count of zeros in the array

        // First loop: calculate product of all non-zero numbers and count zeros
        for (int n : nums) {
            if (n != 0) {
                pro *= n;  // Multiply only non-zero elements
            } else {
                zero++;    // Count number of zeros
            }
        }

        // If more than one zero, every element in the output will be 0
        if (zero > 1) {
            return new int[nums.length];  // Return array filled with 0s
        }

        int[] res = new int[nums.length];

        // Second loop: calculate result for each index
        for (int i = 0; i < nums.length; i++) {
            if (zero > 0) {
                // If there's one zero, only the index with 0 will have product of non-zero elements
                res[i] = (nums[i] == 0) ? pro : 0;
            } else {
                // No zero: divide total product by current element to get product of all others
                res[i] = pro / nums[i];
            }
        }

        return res;  // Return the final array
    }
}
