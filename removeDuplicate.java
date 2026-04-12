import java.util.*;

class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6};
        int n = arr.length;
        System.out.print("Array Before removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        int newLength = removeDuplicates(arr, n);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] arr, int n) {
        // Using HashSet for O(n) space to handle duplicates
        Set<Integer> nonDuplicate = new LinkedHashSet<>();
        for (int num : arr) {
            nonDuplicate.add(num);
        }
        // Copy back to array
        int index = 0;
        for (int num : nonDuplicate) {
            arr[index++] = num;
        }
        return nonDuplicate.size();
    }
}