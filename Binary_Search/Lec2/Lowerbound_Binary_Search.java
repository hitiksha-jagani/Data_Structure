// Time complexity : O(log n), space complexity : O(1)

package Binary_Search.Lec2;

public class Lowerbound_Binary_Search {

    private static int lower_bound(int arr[], int n){
        int low = 0, high = arr.length - 1, mid, res = arr.length;

        while(low <= high) {

            mid = low + (high - low) / 2;

            if(arr[mid] >= n) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args){
        int arr[] = {2, 3, 7, 10, 11, 11, 25};
        int n = 30;

        System.out.println(lower_bound(arr, n));
    }
}
