// n = 3
// * * *
// * *
// *

package Patterns;

import java.util.Scanner;

public class Inverted_Right_Half_Pyramid {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // One Logic
//        for(int i = n; i > 0; i--){
//            for(int j = 0; j < i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        //Second Logic
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}