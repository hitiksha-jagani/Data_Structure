package Binary_Search.Lec2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Upperbound_Built_In_Method {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 3, 3, 5, 7, 9);
        int key = 3;

        int index = Collections.binarySearch(list, key);

        if (index >= 0) {
            while (index < list.size() && list.get(index) == key) {
                index++;
            }
        } else {
            index = -index - 1;
        }

        if (index < list.size()) {
            System.out.println("Upper bound: " + list.get(index));
        } else {
            System.out.println("No upper bound found.");
        }
    }
}
