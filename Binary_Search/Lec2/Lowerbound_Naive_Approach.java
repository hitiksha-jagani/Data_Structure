// Time complexity : O(n), space complexity : O(1)

package Binary_Search.Lec2;

public class Lowerbound_Naive_Approach {

    private static int lower_bound(int arr[], int n){
        int length = arr.length;
        for(int i = 0; i < length; i++) {
            if(arr[i] >= n) {
                return i;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10, 11, 11, 25};
        int n = 11;

        System.out.println(lower_bound(arr, n));
    }
}
