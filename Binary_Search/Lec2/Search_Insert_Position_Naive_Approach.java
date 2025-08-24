// Time complexity : O(n); Space complexity : O(1)

package Binary_Search.Lec2;

public class Search_Insert_Position_Naive_Approach {

    private static int search_insert_position(int arr[], int x){
        int res = arr.length;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= x) {
                res = i;
                break;
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
