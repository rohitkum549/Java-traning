class largestNumber {
    public static void main (String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(findLargest(nums));
    }

    public static int findLargest(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int left = 0;
        int right = nums.length - 1;
        int max = Integer.MIN_VALUE;
        
        while (left <= right) {
            max = Math.max(max, nums[left]);
            if (left != right) {  // Avoid double-counting middle element
                max = Math.max(max, nums[right]);
            }
            left++;
            right--;
        }
        
        return max;
    }
}