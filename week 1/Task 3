public class BinarySearchExample {

    // Binary Search function
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;          // element found
            } else if (arr[mid] < key) {
                low = mid + 1;       // search right half
            } else {
                high = mid - 1;      // search left half
            }
        }
        return -1;   // element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        int key = 23;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
