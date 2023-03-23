public class BinarySearch {
    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }




    int binarySearchRekursiv(int arr[], int l, int r, int x)
    {
        if (r >= l && l <= arr.length - 1) {

            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearchRekursiv(arr, l, mid - 1, x);
            else
                return binarySearchRekursiv(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in
        // array
        return -1;
    }









    public static void main(String[] args) {
        int[] list = {-3, 1, 2, 4, 9, 23};
        System.out.println(binarySearch(list, 2));
    }
}
