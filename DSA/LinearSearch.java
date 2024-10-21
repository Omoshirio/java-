public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return the index if found
            }
        }
        return -1;  // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 0, 1, 9};
        int target = 1;
        int result = linearSearch(array, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
