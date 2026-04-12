class rotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 1;
        rotate(nums, k);
        System.out.print("Output: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void rotate(int[] nums, int k) {
        // Normalize k to avoid extra full rotations
        // Rotating by nums.length gives the same array.
        k = k % nums.length;

        // Reverse the whole array, then reverse the first k elements,
        // and finally reverse the remaining elements.
        // That moves the last k elements to the front in the correct order.
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        // Reverse the subarray nums[start..end] in place using two pointers.
        // This is O(n) time and uses O(1) extra space.
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}