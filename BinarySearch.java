public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[args.length]; // Initialize the array

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]); // Convert String to int
        }

        int key = 30;

        int start = 0;
        int end = arr.length - 1;
        int found = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = 1;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (found==0) {
            System.out.println("Element not found.");
        }
    }
}
