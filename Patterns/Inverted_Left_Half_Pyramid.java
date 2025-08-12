// n= 3
// * * *
//   * *
//     *

package Patterns;

import java.util.Scanner;

public class Inverted_Left_Half_Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            for(int j = 0; j < i; j++){
//                System.out.print(" ");
//                Above line print like this for n = 5
//                        * * * * *
//                         * * * *
//                          * * *
//                           * *
//                            *
                        System.out.print("  ");
            }

            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}