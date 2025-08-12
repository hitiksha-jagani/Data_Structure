//Take n from user and print from 1 to n;
//Time complexity : O(n)
//Space complexity : O(n)

import java.util.Scanner;

//Method 1

// public class Print_1_N {
//     public static void func(int i, int n){
//         if(i > n)   return;

//         System.out.println(i);
//         func(i+1, n);
//     }

//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter n : ");
//         int n = input.nextInt();

//         func(1, n);
        
//         input.close();
//     }
// }

//Method 2 (Backtracking)

public class Print_1_N {
    public static void func(int i, int n){
        if(i < 1)   return;

        func(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = input.nextInt();

        func(n, n);
        
        input.close();
    }
}
