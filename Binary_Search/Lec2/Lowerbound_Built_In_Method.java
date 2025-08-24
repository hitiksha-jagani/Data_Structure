package Binary_Search.Lec2;

import java.util.*;

public class Lowerbound_Built_In_Method {

    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(2, 3, 7, 10, 11, 11, 25);
        int n = 30;

        int result = Collections.binarySearch(arr, n);
        if(result < 0) {
            result = -result - 1;
        }
        System.out.println(result);
    }

}
