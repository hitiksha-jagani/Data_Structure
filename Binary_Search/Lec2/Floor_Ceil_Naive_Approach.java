// Time Complexity : O(n); Space Complexity : O(1)

package Binary_Search.Lec2;

public class Floor_Ceil_Naive_Approach {

    private static int floor(int arr[], int x) {

        int floor = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= x) {
                floor = arr[i];
            }
        }

        return floor;
    }

    private static int ceil(int arr[], int x) {

        int ceil = -1;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] >= x) {
                ceil = arr[i];
            }
        }

        return ceil;

    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 5, 6};
        int x = 5;

        System.out.println(floor(arr, x));
        System.out.println(ceil(arr, x));
    }

}
