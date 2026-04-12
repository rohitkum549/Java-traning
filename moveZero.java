class moveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.print("Output: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static void moveZeroes(int[] nums) {
        // Two pointers: i for traversing, j for placing non-zero
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        // Fill the rest with zeros
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
}