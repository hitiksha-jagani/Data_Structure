// Time complexity : O(log n); Space complexity : O(1)

package Binary_Search.Lec2;

public class Floor_Ceil_Binary_Search {

    private static int floor(int arr[], int x) {
        int res = -1, mid, low = 0, high = arr.length - 1;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] <= x) {
                res = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return res;
    }

    private static int ceil(int arr[], int x) {
        int res = -1, mid, low = 0, high = arr.length - 1;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] >= x) {
                res = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 5, 6};
        int x = 5;

        System.out.println(floor(arr, x));
        System.out.println(ceil(arr, x));
    }
}
