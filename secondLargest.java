class secondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Two pointers: left and right
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Check left element
            if (arr[left] > largest) {
                secondLargest = largest;
                largest = arr[left];
            } else if (arr[left] > secondLargest && arr[left] != largest) {
                secondLargest = arr[left];
            }

            // Check right element
            if (left != right) {  // Avoid double-checking middle
                if (arr[right] > largest) {
                    secondLargest = largest;
                    largest = arr[right];
                } else if (arr[right] > secondLargest && arr[right] != largest) {
                    secondLargest = arr[right];
                }
            }

            left++;
            right--;
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }

        return secondLargest;
    }
}