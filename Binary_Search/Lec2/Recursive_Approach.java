package Binary_Search.Lec2;

public class Recursive_Approach {

    public static int binary_search(int arr[], int x, int low, int high){

        int mid = 0;
        while(high >= low) {
            mid = low + (high - low) / 2;

            if(arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binary_search(arr, x, low, mid - 1);
            } else {
                return binary_search(arr, x, mid + 1, high);
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9, 10, 39};
        int x = 39, result = -1;

        result = binary_search(arr, x, 0, arr.length - 1);

        if(result == -1) {
            System.out.println("Element is not found.");
        } else {
            System.out.println("Element is found at " + (result + 1) + " position");
        }
    }
}
