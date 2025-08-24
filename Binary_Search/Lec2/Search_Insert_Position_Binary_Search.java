// Time complexity : O(log n); Space complexity : O(1)

package Binary_Search.Lec2;

public class Search_Insert_Position_Binary_Search {

    private static int search_insert_position(int arr[], int x){
        int res = arr.length, mid, low = 0, high = arr.length - 1;
        
        while(low <= high) {
            mid = (low + high) / 2;
            
            if(arr[mid] >= x) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return res;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 6};
        int x = 2;

        System.out.println(search_insert_position(arr, x));

    }

}
